package Mini_Castle.app.Services;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.ConnexionPlayerDto;
import Mini_Castle.app.Dto.RegistrationPlayerDto;
import Mini_Castle.app.entity.Player;
import Mini_Castle.app.model.repository.PlayerRepository;

@Service
public class PlayerService implements UserDetailsService{

	@Autowired
	private PlayerRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private final JwtEncoder jwtEncoder;
	
	public PlayerService(JwtEncoder jwtEncoder) {
		super();
		this.jwtEncoder = jwtEncoder;
	}

	public boolean checkIfUsernameExists(String username) {
		return repository.findByUsername(username) != null;
	}
	
	public boolean checkIfMailExists(String mail) {
		return repository.findByMail(mail) != null;
	}

	public Player createPlayer(RegistrationPlayerDto playerDto) {
		playerDto.setPasswd(passwordEncoder.encode(playerDto.getPasswd()));
		return repository.save(new Player(playerDto.getMail(), playerDto.getUsername(), playerDto.getPasswd(), 0));
	}

	public Player connectToPlayer(ConnexionPlayerDto dto) {
		Player player = repository.findByUsername(dto.getUsername());
		if(player == null) {
			return null;
		}
		return player;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findByUsername(username);
	}
	
	public String generateToken(Authentication authentication, Player player) {
		Instant now = Instant.now();
		String scope = authentication.getAuthorities().stream()
				.map(GrantedAuthority::getAuthority)
				.collect(Collectors.joining(""));
		JwtClaimsSet claims = JwtClaimsSet.builder()
				.issuer("self")
				.issuedAt(now)
				.expiresAt(now.plus(1, ChronoUnit.HOURS))
				.subject(authentication.getName())
				.claim("scope", scope)
				.claim("player", player.stringify())
				.build();
		return this.jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
	}
}

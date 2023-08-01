package Mini_Castle.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.ConnexionPlayerDto;
import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.Dto.RegistrationPlayerDto;
import Mini_Castle.app.entity.Player;
import Mini_Castle.app.model.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository repository;
	
	public boolean checkIfUsernameExists(String username) {
		return repository.findByUsername(username) != null;
	}
	
	public boolean checkIfMailExists(String mail) {
		return repository.findByMail(mail) != null;
	}

	public PlayerDto createPlayer(RegistrationPlayerDto playerDto) {
		Player player = repository.save(new Player(playerDto.getMail(), playerDto.getUsername(), playerDto.getPasswd(), 0));
		return new PlayerDto(player);
	}

	public PlayerDto connectToPlayer(ConnexionPlayerDto dto) {
		Player player = repository.findByUsername(dto.getUsername());
		if(player == null || !player.getPasswd().equals(dto.getPasswd())) {
			return null;
		}
		return new PlayerDto(player);
	}
}

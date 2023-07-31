package Mini_Castle.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.entity.Player;
import Mini_Castle.app.model.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository repository;
	
	public boolean checkIfUsernameExists(String username) {
		if(repository.findByUsername(username) != null) return true;
		return false;
	}
	
	public boolean checkIfMailExists(String mail) {
		if(repository.findByMail(mail) != null) return true;
		return false;
	}

	public Player createPlayer(PlayerDto playerDto) {
		Player player = new Player(playerDto.getMail(), playerDto.getNickname(), playerDto.getPasswd(), 0);
		return repository.save(player);
	}
}

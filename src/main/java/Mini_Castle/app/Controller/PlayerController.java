package Mini_Castle.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.Services.PlayerService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@PostMapping("/api/registration")
	public ResponseEntity<PlayerDto> createGameCharacter(@RequestBody PlayerDto playerDto) {
		if(playerDto.getNickname() == null || playerDto.getNickname().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name is empty");
		} else if(playerDto.getMail() == null || playerDto.getMail().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Mail is empty");
		} else if(playerDto.getPasswd() == null || playerDto.getPasswd().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password is empty");
		}
		if (service.checkIfMailExists(playerDto.getMail()) || service.checkIfUsernameExists(playerDto.getNickname())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Mail or username already exists");
		}
		service.createPlayer(playerDto);
		return new ResponseEntity<PlayerDto>(playerDto, HttpStatus.CREATED);
	}
}

package Mini_Castle.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import Mini_Castle.app.Dto.ConnexionPlayerDto;
import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.Dto.RegistrationPlayerDto;
import Mini_Castle.app.Services.PlayerService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@PostMapping("/api/registration")
	public ResponseEntity<PlayerDto> register(@RequestBody RegistrationPlayerDto playerDto) {
		if(playerDto.getUsername() == null || playerDto.getUsername().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name is empty");
		} else if(playerDto.getMail() == null || playerDto.getMail().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Mail is empty");
		} else if(playerDto.getPasswd() == null || playerDto.getPasswd().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password is empty");
		}
		if (service.checkIfMailExists(playerDto.getMail()) || service.checkIfUsernameExists(playerDto.getUsername())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Mail or username already exists");
		}
		return new ResponseEntity<PlayerDto>(service.createPlayer(playerDto), HttpStatus.CREATED);
	}
	
	@PostMapping("/api/connexion")
	public ResponseEntity<PlayerDto> connexion(@RequestBody ConnexionPlayerDto playerLogs) {
		if (!service.checkIfUsernameExists(playerLogs.getUsername())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There's no account with this username.");
		}
		return new ResponseEntity<PlayerDto>(service.findPlayerByUsername(playerLogs.getUsername()), HttpStatus.CREATED);
	}
}

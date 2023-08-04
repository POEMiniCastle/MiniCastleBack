package Mini_Castle.app.Controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import Mini_Castle.app.Dto.ConnexionPlayerDto;
import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.Dto.RegistrationPlayerDto;
import Mini_Castle.app.Services.PlayerService;
import Mini_Castle.app.entity.Player;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@PostMapping(path = "/registration")
	public ResponseEntity<Map<String, String>> register(@RequestBody RegistrationPlayerDto playerDto, HttpServletRequest request) throws ServletException {
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
		
		Player player = service.createPlayer(playerDto);
		
		request.login(playerDto.getUsername(), playerDto.getPasswd());
		
		Authentication auth = (Authentication) request.getUserPrincipal();
		
		HashMap<String, String> res = new HashMap<>();
		res.put("token", service.generateToken(auth, player));
		
		return new ResponseEntity<Map<String, String>>(res, HttpStatus.CREATED);
	}
	
	@PostMapping(path = "/connexion")
	public ResponseEntity<Map<String, String>> connexion(@Validated @RequestBody ConnexionPlayerDto playerLogs, HttpServletRequest request) {
		System.out.println("Je passe ici !");
		if (!service.checkIfUsernameExists(playerLogs.getUsername())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "There's no account with this username.");
		}
		Player player = service.connectToPlayer(playerLogs);
		try {
		    request.login(playerLogs.getUsername(), playerLogs.getPasswd());
		} catch (ServletException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Wrong password");
		}
		
		Authentication auth = (Authentication) request.getUserPrincipal();
		
		HashMap<String, String> res = new HashMap<>();
		res.put("token", service.generateToken(auth, player));
		return new ResponseEntity<Map<String, String>>(res, HttpStatus.CREATED);
	}
	
}

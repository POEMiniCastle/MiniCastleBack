package Mini_Castle.app.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Services.TokenService;

@RestController
public class AuthController {

	private final TokenService tokenService;
	
	public AuthController(TokenService tokenService) {
		this.tokenService = tokenService;
	}

	@PostMapping("/token")
	public String token(Authentication authentication) {
		System.out.println("Token requested for user : '{"+ authentication.getName() +"}'");
		String token = tokenService.generateToken(authentication);
		System.out.println("Token granted :" + token);
		return token;
	}
	
}

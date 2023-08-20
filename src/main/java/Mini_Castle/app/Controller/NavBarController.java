package Mini_Castle.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Dto.NavBarDto;
import Mini_Castle.app.Services.NavBarServices;

@RestController
@CrossOrigin("*")
public class NavBarController {

	@Autowired
	NavBarServices services;
	
	@GetMapping("/navBarAllContent")
	public List<NavBarDto> getAllNavBar(){
		return services.getAllContent();
	}
	
	@GetMapping("/navBarContent")
	public List<NavBarDto> getMiniNavBar(){
		return services.getMinimalContent();
	}
	
}

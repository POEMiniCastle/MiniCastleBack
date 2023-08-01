package Mini_Castle.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Dto.TrapDto;
import Mini_Castle.app.Services.TrapCardServices;

@RestController
@CrossOrigin("*")

public class TrapCardController {

	@Autowired
	private TrapCardServices services;
	
    @GetMapping("api/trapcard/{id}")
    public TrapDto listAllTrapcard(@PathVariable int id){ 
    	return services.getInformationTrap(id);
    	}

}

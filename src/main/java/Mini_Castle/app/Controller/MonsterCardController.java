package Mini_Castle.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Dto.MonsterDto;
import Mini_Castle.app.Services.MonsterCardServices;
import lombok.RequiredArgsConstructor;
@RestController
@CrossOrigin("*")
@RequiredArgsConstructor

public class MonsterCardController {
	
	@Autowired
    private MonsterCardServices services;

    
    @GetMapping("api/monstercard/{id}")
    public MonsterDto getInformation(@PathVariable int id) {
    	return services.getInformationMonster(id);
    }

}

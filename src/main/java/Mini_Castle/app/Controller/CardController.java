package Mini_Castle.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Services.CardServices;
import Mini_Castle.app.entity.Card;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
//@RequestMapping("api/card")

public class CardController {
	
	@Autowired
    private CardServices service;

    @GetMapping("api/card")
    public List<Card> listAllCard(){ 
    	return  service.getAllCards();
    }

    @GetMapping("api/random")
    public List<Card> randomPick(){
    	return service.randomlyPickNineCards();
    }
}





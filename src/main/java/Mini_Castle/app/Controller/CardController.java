package Mini_Castle.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Dto.CardDto;
import Mini_Castle.app.Services.CardServices;
import Mini_Castle.app.entity.Card;

@RestController
@CrossOrigin("*")
//@RequestMapping("api/card")

public class CardController {
	
	@Autowired
    private CardServices service;

    @GetMapping("api/card")
    public List<Card> listAllCard(){ 
    	return service.getAllCardsFromDatabase();
    }

    @GetMapping("api/random")
    public List<CardDto> randomPick(){
    	return service.randomlyPickNineCards();
    }
}





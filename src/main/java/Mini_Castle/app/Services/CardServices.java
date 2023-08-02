package Mini_Castle.app.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.CardDto;
import Mini_Castle.app.entity.Card;
import Mini_Castle.app.model.repository.CardRepository;

@Service
public class CardServices {

	@Autowired
	private CardRepository repository;
	
	public List<Card> getAllCards(){
		return repository.findAll();
	}
	
	public List<CardDto> randomlyPickNineCards(){
		Random rand = new Random();
		List<Card> cards = getAllCards();
		List<CardDto> draw = new ArrayList<>();
		List<CardDto> temp = new ArrayList<>();
		
		for(int i = 0 ; i < cards.size(); i++) {
			if(cards.get(i).getCard_type().equalsIgnoreCase("Monster") || cards.get(i).getCard_type().equalsIgnoreCase("Trap")) {
				CardDto dto = new CardDto(cards.get(i));
				draw.add(dto);
			}
		}
		
		for(int i = 0; i <= 8; i++) {
			int randomNumber = rand.nextInt(draw.size());
				
			temp.add(new CardDto(draw.get(randomNumber),i));
		}

	
		return temp;
	}
}

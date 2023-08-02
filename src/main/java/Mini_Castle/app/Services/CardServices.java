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
		List<CardDto> draw = new ArrayList<>();
		List<CardDto> temp = new ArrayList<>();
		
		for(Card z : getAllCards()) {
			if(z.getCard_type().equalsIgnoreCase("Monster") || z.getCard_type().equalsIgnoreCase("Trap")) {
				draw.add(new CardDto(z.getId(), z.getCard_name(), z.getCard_type(), z.getDescription(), z.getScore_value(), z.getCard_image_path()));
			}
		}
		
		for (int i = 0; i <= 8; i++) {
			int randomNumber = getRandomNumber(draw.size());
			temp.add(draw.get(randomNumber));
		}
		return temp;
	}
	
	//Used to write test
	private int getRandomNumber(int size) {
		Random rand = new Random();
		return rand.nextInt(size);
	}
}

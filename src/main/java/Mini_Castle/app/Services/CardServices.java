package Mini_Castle.app.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.model.repository.CardRepository;

@Service
public class CardServices {

	@Autowired
	CardRepository repository;
	
	public List<Card> getAllCards(){
		return repository.findAll();
	}
	
	public List<Card> randomlyPickNineCards(){
		Random rand = new Random();
		List<Card> draw = new ArrayList<>();
		List<Card> temp = getAllCards();
		for(Card z : temp) {
			if(z.getCard_type().equalsIgnoreCase("Monster") || z.getCard_type().equalsIgnoreCase("Trap")) {
				draw.add(z);
			}
		}
		
		temp.clear();
		for (int i = 0; i <= 8; i++) {
			int randomNumber = rand.nextInt(draw.size());
			temp.add(draw.get(randomNumber));
		}
		return temp;
	}
}

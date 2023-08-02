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
	
	public List<CardDto> randomlyPickNineCards(){
		List<Card> cards = getAllCardsFromDatabase();
		List<CardDto> draw = getMonsterAndTrapCards(cards);
		return pick9RandomCardsFromList(draw);
	}
	
	public List<Card> getAllCardsFromDatabase(){
		return repository.findAll();
	}
	
	private List<CardDto> getMonsterAndTrapCards(List<Card> cards) {
		List<CardDto> res = new ArrayList<>();
		for(int i = 0 ; i < cards.size(); i++) {
			if(cards.get(i).getCard_type().equalsIgnoreCase("Monster") || cards.get(i).getCard_type().equalsIgnoreCase("Trap")) {
				CardDto dto = new CardDto(cards.get(i));
				res.add(dto);
			}
		}
		return res;
	}
	
	/**
	 * 
	 * @param dtoCards
	 * @return a new List of CardDto with 9 cards from dtoCards, also set localIds in each CardDto of the returned list
	 */
	private List<CardDto> pick9RandomCardsFromList(List<CardDto> dtoCards) {
		Random rand = new Random();
		List<CardDto> res = new ArrayList<>();
		for(int i = 0; i <= 8; i++) {
			int randomNumber = rand.nextInt(dtoCards.size());
				
			res.add(new CardDto(dtoCards.get(randomNumber),i));
		}
		return res;
	}
}

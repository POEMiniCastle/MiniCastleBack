package Mini_Castle.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.CardCreationDto;
import Mini_Castle.app.Dto.CardDto;
import Mini_Castle.app.Dto.MonsterDto;
import Mini_Castle.app.entity.Card;
import Mini_Castle.app.entity.MonsterCard;
import Mini_Castle.app.model.repository.CardRepository;
import Mini_Castle.app.model.repository.MonsterCardRepository;

@Service
public class InsertServices {

	@Autowired
	CardRepository repository;
	
	@Autowired
	MonsterCardRepository monsterRepository;
	
	public CardDto insertIntoCard(CardCreationDto card) {
		Card cardTemp = new Card();
		cardTemp.setCard_name(card.getCard().getCard_name());
		cardTemp.setDescription(card.getCard().getDescription());
		cardTemp.setCard_type(card.getCard().getCard_type());
		cardTemp.setScore_value(card.getCard().getScore_value());
		cardTemp.setCard_image_path(card.getCard().getCard_image_path());
		
		repository.save(cardTemp);
		return new CardDto(cardTemp);
	}
	
	public MonsterDto insertMonster(CardCreationDto card) {
		Card cardTemp = repository.findCardByCardName(card.getCard().getCard_name());
		MonsterCard monsterTemp = new MonsterCard();
		monsterTemp.setDamage(card.getMonster().getHp());
		monsterTemp.setHp(card.getMonster().getHp());
		monsterTemp.setXpReward(card.getMonster().getXpReward());
		monsterTemp.setCard(cardTemp);
		
		monsterRepository.save(monsterTemp);
		return new MonsterDto(monsterTemp);
		
	}
}

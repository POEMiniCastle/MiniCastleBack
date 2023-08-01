package Mini_Castle.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.MonsterDto;
import Mini_Castle.app.entity.MonsterCard;
import Mini_Castle.app.model.repository.MonsterCardRepository;

@Service
public class MonsterCardServices {

	@Autowired
    private MonsterCardRepository repository;
	
	public MonsterDto getInformationMonster(Integer id) {
		MonsterCard temp = repository.findMonstercardById(id);
		return new MonsterDto(temp.getId(), temp.getDamage(), temp.getHp(), temp.getXpReward());
		
	}
}

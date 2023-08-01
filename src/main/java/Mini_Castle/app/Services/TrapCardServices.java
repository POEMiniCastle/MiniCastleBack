package Mini_Castle.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.TrapDto;
import Mini_Castle.app.entity.TrapCard;
import Mini_Castle.app.model.repository.TrapCardRepository;

@Service
public class TrapCardServices {

	@Autowired
	private TrapCardRepository repository;
	
	public TrapDto getInformationTrap(Integer id) {
		TrapCard trap = repository.findTrapcardByCardId(id);
		return new TrapDto(trap.getId(), trap.getSkillCheck(), trap.getDamage());
	}
}

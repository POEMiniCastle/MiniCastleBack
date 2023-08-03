package Mini_Castle.app.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.entity.TrapCard;
import Mini_Castle.app.model.repository.TrapCardRepository;

@SpringBootTest
public class TrapCardServiceTest {
	@MockBean
	TrapCardRepository repository;
	
	@Autowired
	TrapCardServices service;
	
	TrapCard testCard = new TrapCard(1, 5, 50, new Card(1, "trap1", "Trap", "A trap", 25, "trap.jpg"));
	
	
	@Test
	public void givenTrapCard_WhenGetInformationTrap_ShouldReturnDtoWithSameId() {
		Mockito.when(repository.findTrapcardByCardId(anyInt())).thenReturn(testCard);
		assertEquals(testCard.getId(), service.getInformationTrap(1).getId());
	}
	
	@Test
	public void givenTrapCard_WhenGetInformationTrap_ShouldReturnDtoWithSameDamage() {
		Mockito.when(repository.findTrapcardByCardId(anyInt())).thenReturn(testCard);
		assertEquals(testCard.getDamage(), service.getInformationTrap(1).getDamage());
	}
	
	@Test
	public void givenTrapCard_WhenGetInformationTrap_ShouldReturnDtoWithSameSkillcheck() {
		Mockito.when(repository.findTrapcardByCardId(anyInt())).thenReturn(testCard);
		assertEquals(testCard.getSkillCheck(), service.getInformationTrap(1).getSkillCheck());
	}
}

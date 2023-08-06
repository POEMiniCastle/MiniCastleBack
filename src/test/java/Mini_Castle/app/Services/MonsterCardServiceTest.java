package Mini_Castle.app.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.entity.MonsterCard;
import Mini_Castle.app.model.repository.MonsterCardRepository;

@SpringBootTest
public class MonsterCardServiceTest {

	@MockBean
	MonsterCardRepository repository;
	
	@Autowired
	MonsterCardServices service;
	
	MonsterCard testCard = new MonsterCard(1, 5, 50, 100, new Card(1, "monster1", "Monster", "A monster", 25, "monster.jpg"));
	
	
	@Test
	public void givenMonsterCard_WhenGetInformationMonster_ShouldReturnDtoWithSameId() {
		Mockito.when(repository.findMonstercardByCardId(anyInt())).thenReturn(testCard);
		assertEquals(testCard.getId(), service.getInformationMonster(1).getId());
	}
	
	@Test
	public void givenMonsterCard_WhenGetInformationMonster_ShouldReturnDtoWithSameDamage() {
		Mockito.when(repository.findMonstercardByCardId(anyInt())).thenReturn(testCard);
		assertEquals(testCard.getDamage(), service.getInformationMonster(1).getDamage());
	}
	
	@Test
	public void givenMonsterCard_WhenGetInformationMonster_ShouldReturnDtoWithSameHp() {
		Mockito.when(repository.findMonstercardByCardId(anyInt())).thenReturn(testCard);
		assertEquals(testCard.getHp(), service.getInformationMonster(1).getHp());
	}
	
	// @Test
	// public void givenMonsterCard_WhenGetInformationMonster_ShouldReturnDtoWithSameXpReward() {
	// 	Mockito.when(repository.findMonstercardByCardId(anyInt())).thenReturn(testCard);
	// 	assertEquals(testCard.getXpReward(), service.getInformationMonster(1).getXp_reward());
	// }
	
}

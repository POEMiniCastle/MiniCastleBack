package Mini_Castle.app.model.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import Mini_Castle.app.entity.TrapCard;

@DataJpaTest
public class TrapCardRepositoryTest {

	@Autowired
	private TrapCardRepository repository;
	
	@Test
	@Sql("given3TrapCards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder.sql")
	public void given3TrapCards_WhenFindAllCardByOrderByIdAsc_ShouldReturn3Cards() {
		List<TrapCard> cards = repository.findAllTrapcardByOrderByIdAsc();
		assertEquals(3, cards.size());
	}
	
	@Test
	@Sql("given3TrapCards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder.sql")
	public void given3TrapCards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder() {
		List<TrapCard> cards = repository.findAllTrapcardByOrderByIdAsc();
		boolean test = true;
		for (int i = 1; i < cards.size(); i++) {
			if(cards.get(i).getId() < cards.get(i-1).getId()) {
				test = false;
			}
		}
		assertTrue(test);
	}
	
	@Test
	@Sql("given3TrapCards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder.sql")
	public void given3TrapCards_WhenFindCardById_ShouldReturnTrapCardWithCorrespondingId() {
		TrapCard card = repository.findTrapcardByCardId(1);
		assertEquals(1, card.getId());
	}
}

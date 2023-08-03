package Mini_Castle.app.model.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import Mini_Castle.app.entity.Card;

@DataJpaTest
public class CardRepositoryTest {

	@Autowired
	private CardRepository repository;
	
	@Test
	@Sql("given3Cards_WhenFindAll_ShouldReturnCards.sql")
	public void given3Cards_WhenFindAll_ShouldReturn3Cards() {
		List<Card> cards = repository.findAll();
		assertEquals(3, cards.size());
	}
	
	@Test
	@Sql("given3Cards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder.sql")
	public void given3Cards_WhenFindAllCardByOrderByIdAsc_ShouldReturn3Cards() {
		List<Card> cards = repository.findAllCardByOrderByIdAsc();
		assertEquals(3, cards.size());
	}
	
	@Test
	@Sql("given3Cards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder.sql")
	public void given3Cards_WhenFindAllCardByOrderByIdAsc_ShouldReturnCardsInOrder() {
		List<Card> cards = repository.findAllCardByOrderByIdAsc();
		boolean test = true;
		for (int i = 1; i < cards.size(); i++) {
			if(cards.get(i).getId() < cards.get(i-1).getId()) {
				test = false;
			}
		}
		assertTrue(test);
	}
	
	@Test
	@Sql("given3Cards_WhenFindCardById_ShouldReturnCardWithCorrespondingId.sql")
	public void given3Cards_WhenFindCardById_ShouldReturnCardWithCorrespondingId() {
		Card card = repository.findCardById(1);
		assertEquals(1, card.getId());
	}
}

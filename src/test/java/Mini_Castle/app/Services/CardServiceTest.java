package Mini_Castle.app.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.model.repository.CardRepository;

@SpringBootTest
public class CardServiceTest {

	@MockBean
	CardRepository repository;
	
	@Autowired
	private CardServices service;

	private List<Card> list;
	
	@BeforeEach
	public void setUp() {
		list = new ArrayList<Card>();
		list.add(new Card(1, "monstre1", "Monster", "A monster", 8, "image/monstercard.jpg"));
		list.add(new Card(2, "monstre2", "Monster", "A second monster", 6, "image/monstercard.jpg"));
		list.add(new Card(3, "trap1", "Trap", "A trap", 15, "image/trapcard.jpg"));
		list.add(new Card(4, "trap2", "Trap", "A second trap", 20, "image/trapcard.jpg"));
		list.add(new Card(5, "monstre3", "Monster", "A third monster", 7, "image/monstercard.jpg"));
		list.add(new Card(6, "monstre4", "Monster", "A fourth monster", 11, "image/monstercard.jpg"));
		list.add(new Card(7, "monstre5", "Monster", "A fifth monster", 4, "image/monstercard.jpg"));
		list.add(new Card(8, "trap3", "Trap", "A third trap", 9, "image/trapcard.jpg"));
		list.add(new Card(9, "monstre6", "Monster", "A sixth monster", 16, "image/monstercard.jpg"));
		list.add(new Card(10, "monstre7", "Monster", "A seventh monster", 21, "image/monstercard.jpg"));
	}
	
	@Test
	public void given10Cards_WhenRandomlyPickNineCards_ShouldReturn9Cards() {
		Mockito.when(repository.findAll()).thenReturn(list);
		assertEquals(9, service.randomlyPickNineCards().size());
	}
	
}

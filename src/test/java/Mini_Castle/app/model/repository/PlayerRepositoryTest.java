package Mini_Castle.app.model.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import Mini_Castle.app.entity.Player;


@DataJpaTest
public class PlayerRepositoryTest {
	
	@Autowired
	private PlayerRepository repository;
	
	@Test
	@Sql("given3Players_WhenFindAll_ShouldReturnPlayers.sql")
	public void given3Players_WhenFindAll_ShouldReturnPlayers() {
		List<Player> players = repository.findAll();
		assertEquals(3, players.size());;
	}
	
	@Test
	@Sql("given1Player_WhenFindByMail_ShouldReturnPlayer.sql")
	public void given1Player_WhenFindByMail_ShouldReturnPlayer() {
		Player player = repository.findByMail("mail@mail.com");
		assertEquals("Billy", player.getUsername());;
	}
	
	@Test
	@Sql("given1Player_WhenFindByMail_ShouldReturnPlayer.sql")
	public void given0Player_WhenFindByMail_ShouldReturnNull() {
		Player player = repository.findByMail("invalidmail@mail.com");
		assertEquals(null, player);
	}
	
	@Test
	@Sql("given1Player_WhenFindByUsername_ShouldReturnPlayer.sql")
	public void given1Player_WhenFindByUsername_ShouldReturnPlayer() {
		Player player = repository.findByUsername("Billy");
		assertEquals("mail@mail.com", player.getMail());
	}
	
	@Test
	@Sql("given1Player_WhenFindByUsername_ShouldReturnPlayer.sql")
	public void given0Player_WhenFindByUsername_ShouldReturnNull() {
		Player player = repository.findByUsername("invalid username");
		assertEquals(null, player);
	}
	
	@Test
	@Sql("given1Player_WhenSave_ShouldReturnPlayer.sql")
	public void given1Player_WhenSave_ShouldReturnPlayer() {
		Player p = new Player("email@email.com", "Bob", "password", 0);
		Player player = repository.save(p);
		assertEquals(p, player);
	}
}

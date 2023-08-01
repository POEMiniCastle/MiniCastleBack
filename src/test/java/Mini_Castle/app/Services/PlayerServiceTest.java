package Mini_Castle.app.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import Mini_Castle.app.Dto.ConnexionPlayerDto;
import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.Dto.RegistrationPlayerDto;
import Mini_Castle.app.entity.Player;
import Mini_Castle.app.model.repository.PlayerRepository;

@SpringBootTest
public class PlayerServiceTest {

	@MockBean
	PlayerRepository repository;
	
	@Autowired
	private PlayerService service;
	
	@Test
	public void givenExistingUsername_WhenCheckIfUsernameExists_ShouldReturnTrue() {
		Mockito.when(repository.findByUsername("Billy")).thenReturn(new Player("mail", "Billy", "password", 0));
		assertTrue(service.checkIfUsernameExists("Billy"));
	}
	
	@Test
	public void givenBadUsername_WhenCheckIfUsernameExists_ShouldReturnFalse() {
		Mockito.when(repository.findByUsername("Billy")).thenReturn(null);
		assertFalse(service.checkIfUsernameExists("Billy"));
	}
	
	@Test
	public void givenExistingMail_WhenCheckIfMailExists_ShouldReturnTrue() {
		Mockito.when(repository.findByMail("mail")).thenReturn(new Player("mail", "Billy", "password", 0));
		assertTrue(service.checkIfMailExists("mail"));
	}
	
	@Test
	public void givenBadMail_WhenCheckIfMailExists_ShouldReturnFalse() {
		Mockito.when(repository.findByMail("mail")).thenReturn(null);
		assertFalse(service.checkIfMailExists("mail"));
	}
	
	@Test
	public void givenRegistrationPlayerDto_WhenCreatePlayer_ShouldReturnPlayerDto() {
		RegistrationPlayerDto dto = new RegistrationPlayerDto("mail", "Billy", "password");
		Player player = new Player("mail", "Billy", "password", 0);
		Mockito.when(repository.save(any(Player.class))).thenReturn(player);
		assertEquals(new PlayerDto(player), service.createPlayer(dto));
	}
	
	@Test
	public void givenExistingConnexionPlayerDto_WhenConnectToPlayer_ShouldReturnPlayerDto() {
		ConnexionPlayerDto dto = new ConnexionPlayerDto("Billy", "password");
		Player player = new Player("mail", "Billy", "password", 0);
		Mockito.when(repository.findByUsername(any(String.class))).thenReturn(player);
		assertEquals(new PlayerDto(player), service.connectToPlayer(dto));
	}
	
	@Test
	public void givenInexistingConnexionPlayerDto_WhenConnectToPlayer_ShouldReturnNull() {
		ConnexionPlayerDto dto = new ConnexionPlayerDto("Billy", "password");
		Mockito.when(repository.findByUsername(any(String.class))).thenReturn(null);
		assertEquals(null, service.connectToPlayer(dto));
	}
	
	@Test
	public void givenBadPassword_WhenConnectToPlayer_ShouldReturnNull() {
		ConnexionPlayerDto dto = new ConnexionPlayerDto("Billy", "password");
		Mockito.when(repository.findByUsername(any(String.class))).thenReturn(new Player("mail", "Billy", "wrongpassowrd", 0));
		assertEquals(null, service.connectToPlayer(dto));
	}
}

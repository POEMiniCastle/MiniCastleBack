package Mini_Castle.app.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import Mini_Castle.app.Dto.ConnexionPlayerDto;
import Mini_Castle.app.Dto.PlayerDto;
import Mini_Castle.app.Dto.RegistrationPlayerDto;
import Mini_Castle.app.Services.PlayerService;
import Mini_Castle.app.entity.Player;

@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	PlayerService service;
	
	@Test
	public void whenRegisterWithNewMailAndUsername_ShouldCallService() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		mvc.perform(requestBuilder);
		
		Mockito.verify(service, Mockito.times(1)).createPlayer(any(RegistrationPlayerDto.class));
	}
	
	@Test
	public void whenRegisterWithExistingMail_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(true);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithExistingUsername_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(true);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithEmptyMail_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "",
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithNullMail_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithEmptyUsername_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"username": "",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithNullUsername_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithEmptyPassword_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = 	MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"username": "Billy",
							"passwd": ""
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenRegisterWithNullPassword_ShouldThrow400() throws Exception {
		Mockito.when(service.checkIfMailExists(any(String.class))).thenReturn(false);
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(false);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/api/registration")
				.content("""
						{
							"mail": "mail",
							"username": "Billy"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);
		
		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenConnexionWithExistingUser_ShouldCallService() throws Exception {
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(true);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/api/connexion")
				.content("""
						{
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);

		mvc.perform(requestBuilder);
		
		Mockito.verify(service, Mockito.times(1)).connectToPlayer(any(ConnexionPlayerDto.class));
	}
	
	@Test
	public void whenConnexionWithExistingUser_ShouldReturn201() throws Exception {
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(true);
		Mockito.when(service.connectToPlayer(any(ConnexionPlayerDto.class))).thenReturn(new PlayerDto(1, "mail", "Billy", 0));
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/api/connexion")
				.content("""
						{
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);

		assertEquals(201,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
	
	@Test
	public void whenConnexionWithInexistingUser_ShouldReturn400() throws Exception {
		Mockito.when(service.checkIfUsernameExists(any(String.class))).thenReturn(true);
		Mockito.when(service.connectToPlayer(any(ConnexionPlayerDto.class))).thenReturn(null);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/api/connexion")
				.content("""
						{
							"username": "Billy",
							"passwd": "password"
						}
						"""
				).contentType(MediaType.APPLICATION_JSON);

		assertEquals(400,mvc.perform(requestBuilder).andReturn().getResponse().getStatus());
	}
}

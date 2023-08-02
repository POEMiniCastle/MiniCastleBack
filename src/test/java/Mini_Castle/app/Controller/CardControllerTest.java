package Mini_Castle.app.Controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import Mini_Castle.app.Services.CardServices;

@SpringBootTest
@AutoConfigureMockMvc
public class CardControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	CardServices service;
	
	@Test
	public void whenListAllCard_ShouldCallService() throws Exception {
		Mockito.when(service.getAllCards()).thenReturn(null);
		mvc.perform(MockMvcRequestBuilders.get("/api/card"))
				.andReturn()
				.getResponse();
		Mockito.verify(service, Mockito.times(1)).getAllCards();
	}
	
	@Test
	public void whenRandomPick_ShouldCallService() throws Exception {
		Mockito.when(service.randomlyPickNineCards()).thenReturn(null);
		mvc.perform(MockMvcRequestBuilders.get("/api/random"))
				.andReturn()
				.getResponse();
		Mockito.verify(service, Mockito.times(1)).randomlyPickNineCards();
	}
}

package Mini_Castle.app.Controller;

import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import Mini_Castle.app.Services.MonsterCardServices;

@SpringBootTest
@AutoConfigureMockMvc
public class MonsterCardControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	MonsterCardServices service;
	
	@Test
	public void whenGetInformationMonster_ShouldCallService() throws Exception {
		Mockito.when(service.getInformationMonster(anyInt())).thenReturn(null);
		mvc.perform(MockMvcRequestBuilders.get("/api/monstercard/1"))
				.andReturn()
				.getResponse();
		Mockito.verify(service, Mockito.times(1)).getInformationMonster(1);
	}
}

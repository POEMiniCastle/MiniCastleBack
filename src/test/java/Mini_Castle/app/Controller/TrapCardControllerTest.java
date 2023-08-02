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

import Mini_Castle.app.Services.TrapCardServices;

@SpringBootTest
@AutoConfigureMockMvc
public class TrapCardControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	TrapCardServices service;
	
	@Test
	public void whenGetInformationTrap_ShouldCallService() throws Exception {
		Mockito.when(service.getInformationTrap(anyInt())).thenReturn(null);
		mvc.perform(MockMvcRequestBuilders.get("/api/trapcard/1"))
				.andReturn()
				.getResponse();
		Mockito.verify(service, Mockito.times(1)).getInformationTrap(1);
	}
}

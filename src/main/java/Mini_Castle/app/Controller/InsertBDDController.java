package Mini_Castle.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.Dto.CardCreationDto;
import Mini_Castle.app.Services.InsertServices;

@RestController
public class InsertBDDController {

	@Autowired
	InsertServices service;
	
	@PostMapping("/api/insert")
	public ResponseEntity<CardCreationDto> insert(@RequestBody CardCreationDto cardCreationDto) {
		return null;
		
	}
}

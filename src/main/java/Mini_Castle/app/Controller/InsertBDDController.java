package Mini_Castle.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import Mini_Castle.app.Dto.CardCreationDto;
import Mini_Castle.app.Services.InsertServices;

@RestController
@CrossOrigin("*")
public class InsertBDDController {

	@Autowired
	InsertServices service;
	
	@PostMapping("/api/insertCard")
	public ResponseEntity<CardCreationDto> insert(@RequestBody CardCreationDto cardCreationDto) {
		if(!(service.checkIfExist(cardCreationDto.getCard().getCard_name()))) {
			CardCreationDto cardTemp = new CardCreationDto();
			cardTemp.setCard(service.insertIntoCard(cardCreationDto));
				if(service.checkIfExist(cardTemp.getCard().getCard_name())){
					cardTemp.setMonster(service.insertMonster(cardCreationDto));
					return new ResponseEntity<CardCreationDto>(cardTemp, HttpStatus.CREATED);
				} else {
					throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Manque Monstre");
				}
			
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Already Exist");
		}
		
	}
}

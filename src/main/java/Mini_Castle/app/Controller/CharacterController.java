package miniCastle.controllers;

import miniCastle.dto.CharacterDto;
import miniCastle.services.CharacterService;

public class CharacterController {
	
	private CharacterService service = new CharacterService();
	
	public void readCharacter (CharacterDto characterDto) {
		
		service.readCharacter(characterDto);
	}
}

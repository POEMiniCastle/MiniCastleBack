package miniCastle.controllers;

import miniCastle.dao.TrapCard;
import miniCastle.dto.TrapCardDto;
import miniCastle.services.TrapCardService;

public class TrapCardController {
	private TrapCardService service = new TrapCardService();
	
	public TrapCard readTrapCard(TrapCardDto trapCardDto) {
		return service.readTrapCard(trapCardDto);
	}
	
	public void update(TrapCardDto trapCardDto)
	{
		service.update(trapCardDto);
	}
	
	public void insert(TrapCardDto trapCardDto)
	{
		service.insert(trapCardDto);
	}
}

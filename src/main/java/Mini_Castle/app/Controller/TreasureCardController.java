package miniCastle.controllers;

import miniCastle.dao.TreasureCard;
import miniCastle.dto.TreasureCardDto;
import miniCastle.services.TreasureCardService;

public class TreasureCardController {
	private TreasureCardService service = new TreasureCardService();
	
	public TreasureCard readTreasureCard(TreasureCardDto treasureCardDto) {
		return service.readTreasureCard(treasureCardDto);
	}
	
	public void update(TreasureCardDto treasureCardDto)
	{
		service.update(treasureCardDto);
	}
	
	public void insert(TreasureCardDto treasureCardDto)
	{
		service.insert(treasureCardDto);
	}
}

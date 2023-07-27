package miniCastle.controllers;

import miniCastle.dao.MonsterCard;
import miniCastle.dto.MonsterCardDto;
import miniCastle.services.MonsterCardService;

public class MonsterCardController {
	private MonsterCardService service = new MonsterCardService();
	
	public MonsterCard readMonsterCard(MonsterCardDto monsterCardDto) {
		return service.readMonsterCard(monsterCardDto);
	}
	
	public void update(MonsterCardDto monsterCardDto)
	{
		service.update(monsterCardDto);
	}
	
	public void insert(MonsterCardDto monsterCardDto)
	{
		service.insert(monsterCardDto);
	}
	
	public void delete(MonsterCardDto monsterCardDto)
	{
		service.delete(monsterCardDto);
	}
	
	public void run() {
		// TODO Auto-generated method stub
	}
}

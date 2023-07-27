package miniCastle.controllers;

import miniCastle.dto.GearDto;
import miniCastle.services.GearService;

public class GearController {

	private GearService service = new GearService();
	
	
	public void readGear (GearDto gearDto) {
		
		service.readGear(gearDto);
	}
	
	public void createGear (GearDto gearDto) {
		
		service.createGear(gearDto);
	}
	
}

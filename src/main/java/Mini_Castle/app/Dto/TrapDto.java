package Mini_Castle.app.Dto;

import Mini_Castle.app.entity.TrapCard;

public class TrapDto {

	private Integer id;
	private Integer skillCheck;
	private Integer damage;
	
	public TrapDto(Integer id, Integer skillCheck, Integer damage) {
		this.id = id;
		this.skillCheck = skillCheck;
		this.damage = damage;
	}
	
	public TrapDto() {}

	public TrapDto(TrapCard trap) {
		this.id = trap.getId();
		this.damage = trap.getDamage();
		this.skillCheck = trap.getSkillCheck();
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSkillCheck() {
		return skillCheck;
	}

	public void setSkillCheck(Integer skillCheck) {
		this.skillCheck = skillCheck;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}
	
	
}

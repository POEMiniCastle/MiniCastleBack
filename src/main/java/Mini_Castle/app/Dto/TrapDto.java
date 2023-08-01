package Mini_Castle.app.Dto;

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

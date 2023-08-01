package Mini_Castle.app.Dto;

public class MonsterDto {
	
	private Integer id;
	private Integer damage;
	private Integer hp;
	private Integer xpReward;
	
	
	public MonsterDto(Integer id, Integer damage, Integer hp, Integer xpReward) {
		this.id = id;
		this.damage = damage;
		this.hp = hp;
		this.xpReward = xpReward;
	}
	
	public MonsterDto() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDamage() {
		return damage;
	}
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getXpReward() {
		return xpReward;
	}
	public void setXpReward(Integer xpReward) {
		this.xpReward = xpReward;
	}
	
	
}

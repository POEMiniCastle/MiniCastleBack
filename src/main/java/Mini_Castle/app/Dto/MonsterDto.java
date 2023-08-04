package Mini_Castle.app.Dto;

import Mini_Castle.app.entity.MonsterCard;

public class MonsterDto {
	
	private Integer id;
	private Integer damage;
	private Integer hp;
	private Integer xp_reward;
	
	
	public MonsterDto(Integer id, Integer damage, Integer hp, Integer xp_reward) {
		this.id = id;
		this.damage = damage;
		this.hp = hp;
		this.xp_reward = xp_reward;
	}
	
	public MonsterDto() {}
	
	public MonsterDto(MonsterCard card) {
		this.id = card.getId();
		this.damage = card.getDamage();
		this.hp = card.getHp();
		this.xpReward = card.getXpReward();
	}
	
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
	public Integer getXp_reward() {
		return xp_reward;
	}
	public void setXp_reward(Integer xp_reward) {
		this.xp_reward = xp_reward;
	}
	
	
}

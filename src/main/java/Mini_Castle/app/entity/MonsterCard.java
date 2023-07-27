package miniCastle.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "monster_card_Dto")

public class MonsterCard {
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "monster_id")
	private int monsterId;

	@Column(name = "damage")
	private int damage;

	@Column(name = "hp")
	private int hp;

	@Column(name = "xp_reward")
	private int xpReward;

	@ManyToMany
	@JoinTable(name = "card_monster_card", joinColumns = @JoinColumn(name = "monster_id"), inverseJoinColumns = @JoinColumn(name = "card_id"))
	private List<Card> monsterCards;

	public MonsterCard() {
	}

	public MonsterCard(int cardId, int monsterId, int damage, int hp, int xpReward) {
		this.cardId = cardId;
		this.monsterId = monsterId;
		this.damage = damage;
		this.hp = hp;
		this.xpReward = xpReward;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getMonsterId() {
		return monsterId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getXpReward() {
		return xpReward;
	}

	public void setXpReward(int xpReward) {
		this.xpReward = xpReward;
	}

}

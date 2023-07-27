package miniCastle.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "trap_card_Dto")

public class TrapCard {

	@Column(name = "card_id")
	private int cardId;

	@Column(name = "trap_id")
	private int trapId;

	@Column(name = "skill_check")
	private int skillCheck;

	@Column(name = "damage")
	private int damage;

	@ManyToMany
	@JoinTable(name = "card_trap_card", joinColumns = @JoinColumn(name = "trap_id"), inverseJoinColumns = @JoinColumn(name = "card_id"))
	private List<Card> trapCards;

	public TrapCard() {
	}

	public TrapCard(int cardId, int trapId, int skillCheck, int damage) {
		this.cardId = cardId;
		this.trapId = trapId;
		this.skillCheck = skillCheck;
		this.damage = damage;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getTrapId() {
		return trapId;
	}

	public void setTrapId(int trapId) {
		this.trapId = trapId;
	}

	public int getSkillCheck() {
		return skillCheck;
	}

	public void setSkillCheck(int skillCheck) {
		this.skillCheck = skillCheck;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}
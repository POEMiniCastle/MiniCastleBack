package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "trapCard")
@NoArgsConstructor
@Getter
@Setter

public class TrapCard {

	@Id
	@PrimaryKeyJoinColumn(name = "card_id")
	private Integer Id;

	@Column(name = "skill_check")
	private Integer skillCheck;

	@Column(name = "damage")
	private Integer damage;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

	public TrapCard(Integer cardId, Integer skillCheck, Integer damage, Card card) {
		this.Id = cardId;
		this.skillCheck = skillCheck;
		this.damage = damage;
		this.card = card;
	}

	public Integer getCardId() {
		return Id;
	}

	public void setCardId(Integer cardId) {
		this.Id = cardId;
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
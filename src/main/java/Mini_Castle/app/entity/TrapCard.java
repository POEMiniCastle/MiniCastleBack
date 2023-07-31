package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "trapcard")
@Getter
@Setter

public class TrapCard {

    @Id
    @Column(name="TrapCard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name = "skill_check")
	private Integer skillCheck;

	@Column(name = "damage")
	private Integer damage;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

	public TrapCard(Integer cardId, Integer skillCheck, Integer damage, Card card) {
		this.id = cardId;
		this.skillCheck = skillCheck;
		this.damage = damage;
		this.card = card;
	}

	public TrapCard() {}
	
	public Integer getCardId() {
		return id;
	}

	public void setCardId(Integer id) {
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
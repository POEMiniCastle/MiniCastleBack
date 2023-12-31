package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "trapcard")

public class TrapCard {

    @Id
    @Column(name="trapcard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name = "skill_check")
	private Integer skillCheck;

	@Column(name = "damage")
	private Integer damage;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

	public TrapCard() {}

	public TrapCard(Integer cardId, Integer skillCheck, Integer damage, Card card) {
		this.id = cardId;
		this.skillCheck = skillCheck;
		this.damage = damage;
		this.card = card;
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
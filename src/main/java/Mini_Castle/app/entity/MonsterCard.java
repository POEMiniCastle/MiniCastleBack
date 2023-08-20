package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "monstercard")

public class MonsterCard {

	@Id
    @Column(name="monstercard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "hp")
	private Integer hp;

	@Column(name = "xp_reward")
	private Integer xp_reward;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

	public MonsterCard() {}
	
	public MonsterCard(Integer cardId, Integer damage, Integer hp, Integer xp_reward, Card card) {
		this.id = cardId;
		this.damage = damage;
		this.hp = hp;
		this.xp_reward = xp_reward;
		this.card = card;
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

	public Integer getXpReward() {
		return xp_reward;
	}

	public void setXpReward(Integer xp_reward) {
		this.xp_reward = xp_reward;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	
}
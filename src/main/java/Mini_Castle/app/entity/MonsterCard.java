package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "monsterCard")
@NoArgsConstructor
@Getter
@Setter

public class MonsterCard {

	@Id
	@PrimaryKeyJoinColumn(name = "card_id")
	private Integer Id;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "hp")
	private Integer hp;

	@Column(name = "xp_reward")
	private Integer xpReward;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

	public MonsterCard(Integer cardId, Integer damage, Integer hp, Integer xpReward, Card card) {
		this.Id = cardId;
		this.damage = damage;
		this.hp = hp;
		this.xpReward = xpReward;
		this.card = card;
	}

	public Integer getCardId() {
		return Id;
	}

	public void setCardId(Integer cardId) {
		this.Id = cardId;
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	

}

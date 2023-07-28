package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "monstercard")
@NoArgsConstructor
@Getter
@Setter

public class MonsterCard {

	@Id
    @Column(name="monsterCard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
		this.id = cardId;
		this.damage = damage;
		this.hp = hp;
		this.xpReward = xpReward;
		this.card = card;
	}
}
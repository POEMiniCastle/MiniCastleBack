package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "treasurecard")

public class TreasureCard {

	@Id
    @Column(name="TreasureCard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

	public TreasureCard(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	
}
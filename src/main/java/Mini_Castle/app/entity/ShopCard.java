package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shopcard")

public class ShopCard {

	@Id
    @Column(name="ShopCard_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column(name = "price")
	private Integer price;

	@Column(name = "quantity")
	private Integer quantity;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;
	
	public ShopCard(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	
}
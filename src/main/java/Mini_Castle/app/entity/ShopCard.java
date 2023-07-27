package miniCastle.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "shop_card_Dto")

public class ShopCard {

	@Column(name = "card_id")
	private int cardId;

	@Column(name = "shop_id")
	private int shopId;

	@Column(name = "loot_id")
	private int lootId;

	@Column(name = "price")
	private int price;

	@Column(name = "quantity")
	private int quantity;

	@ManyToMany
	@JoinTable(name = "card_shop_card", joinColumns = @JoinColumn(name = "shop_id"), inverseJoinColumns = @JoinColumn(name = "card_id"))
	private List<Card> shopCards;

	@ManyToMany(mappedBy = "shopCards")
	private List<LootTable> lootTables;

	public ShopCard() {
	}

	public ShopCard(int cardId, int shopId, int lootId, int price, int quantity) {
		this.cardId = cardId;
		this.shopId = shopId;
		this.lootId = lootId;
		this.price = price;
		this.quantity = quantity;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getLootId() {
		return lootId;
	}

	public void setLootId(int lootId) {
		this.lootId = lootId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
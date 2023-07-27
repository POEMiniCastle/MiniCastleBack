package miniCastle.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "treasure_card")

public class TreasureCard {
	@Column(name = "card_id")
	private int cardId;

	@Column(name = "loot_id")
	private int lootId;

	@Column(name = "treasure_id")
	private int treasureId;

	@OneToMany(mappedBy = "treasureCard")
	private List<LootTable> lootTables;

	public TreasureCard() {
	}

	public TreasureCard(int cardId, int lootId, int treasureId) {
		this.cardId = cardId;
		this.lootId = lootId;
		this.treasureId = treasureId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getLootId() {
		return lootId;
	}

	public void setLootId(int lootId) {
		this.lootId = lootId;
	}

	public int getTreasureId() {
		return treasureId;
	}

	public void setTreasureId(int treasureId) {
		this.treasureId = treasureId;
	}

}
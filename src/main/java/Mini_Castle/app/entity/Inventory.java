package miniCastle.entity;

import jakarta.persistence.*;

import miniCastle.dao.Gear;

@Entity
@Table(name = "inventory")

public class Inventory {

	@Id
	@Column(name = "character_id")
	private Integer characterId;

	@Column(name = "coin")
	private Integer coin;

	@Column(name = "potion")
	private Integer potion;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Character character;

	public Inventory() {

	}

	public Inventory(Integer characterId, Integer coin, Integer potion, Character character) {
		this.characterId = characterId;
		this.coin = coin;
		this.potion = potion;
		this.character = character;
	}

	// Getters and setters

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Integer getCoin() {
		return coin;
	}

	public void setCoin(Integer coin) {
		this.coin = coin;
	}

	public Integer getPotion() {
		return potion;
	}

	public void setPotion(Integer potion) {
		this.potion = potion;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
}
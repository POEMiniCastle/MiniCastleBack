package miniCastle.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gear")

public class Gear {

	@Id
	@Column(name = "character_id")
	private Integer characterId;

	@Column(name = "gear_slot_id")
	private int gearSlotId;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "armor")
	private Integer armor;

	@Column(name = "price")
	private Integer price;

	@ManyToOne
	@JoinColumn(name = "character_id", insertable = false, updatable = false)
	private Character character;

	public Gear() {

	}

	public Gear(Integer characterId, int gearSlotId, Integer damage, Integer armor, Integer price,
			Character character) {
		this.characterId = characterId;
		this.gearSlotId = gearSlotId;
		this.damage = damage;
		this.armor = armor;
		this.price = price;
		this.character = character;
	}

	// Getters and setters

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}



	public int getGearSlotId() {
		return gearSlotId;
	}

	public void setGearSlotId(int gearSlotId) {
		this.gearSlotId = gearSlotId;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
}
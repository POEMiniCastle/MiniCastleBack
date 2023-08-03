package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gear")

public class Gear {
	
	@Id
	@Column(name = "gear_slot_id")
	private String id;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "armor")
	private Integer armor;

	@Column(name = "price")
	private Integer price;

	@ManyToOne
	@JoinColumn(name = "character_id")
	private Character character;

	Gear(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
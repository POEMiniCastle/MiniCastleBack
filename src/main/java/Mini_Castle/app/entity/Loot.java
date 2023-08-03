package Mini_Castle.app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "loot")

public class Loot {

	@Id
	@Column(name = "loot_id")
	private Integer id;

	@Column(name = "gear_slot_id")
	private Integer gearSlotId;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "armor")
	private Integer armor;

	@Column(name = "item_name")
	private String itemName;

	@JsonIgnore
	@ManyToMany(mappedBy = "loots")
	private List<Card> cards;

	public Loot(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGearSlotId() {
		return gearSlotId;
	}

	public void setGearSlotId(Integer gearSlotId) {
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	

}

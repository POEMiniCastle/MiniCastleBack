package miniCastle.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "loot_table_Dto")

public class LootTable {

	@Column(name = "loot_id")
	private int lootId;

	@Column(name = "gear_slot_id")
	private int gearSlotId;

	@Column(name = "damage")
	private int damage;

	@Column(name = "armor")
	private int armor;

	@Column(name = "item_name")
	private String name;

	@OneToMany(mappedBy = "lootTable")
	private List<TreasureCard> treasureCards;

	@ManyToMany(mappedBy = "lootTables")
	private List<ShopCard> shopCards;

	public LootTable() {
	}

	public LootTable(int lootId, int gearSlotId, int damage, int armor, String name) {
		super();
		this.lootId = lootId;
		this.gearSlotId = gearSlotId;
		this.damage = damage;
		this.armor = armor;
		this.name = name;
	}

	public int getLootId() {
		return lootId;
	}

	public void setLootId(int lootId) {
		this.lootId = lootId;
	}

	public int getGearSlotId() {
		return gearSlotId;
	}

	public void setGearSlotId(int gearSlotId) {
		this.gearSlotId = gearSlotId;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

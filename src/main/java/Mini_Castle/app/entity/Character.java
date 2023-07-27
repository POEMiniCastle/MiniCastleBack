package miniCastle.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "character_Dto")

public class Character {
	@Id
	@Column(name = "character_id")
	private Integer characterId;

	@Column(name = "level")
	private Integer level;

	@Column(name = "xp")
	private Integer xp;

	@ManyToOne
	@JoinColumn(name = "player_id")
	private Player player;

	@ManyToOne
	@JoinColumn(name = "class_id")
	private BaseClassStats classStats;

	@Column(name = "inventory_id")
	private Integer inventoryId;

	public Character() {

	}

	public Character(Integer characterId, Integer level, Integer xp, Player player, BaseClassStats classStats,
			Integer inventoryId) {
		this.characterId = characterId;
		this.level = level;
		this.xp = xp;
		this.player = player;
		this.classStats = classStats;
		this.inventoryId = inventoryId;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public BaseClassStats getClassStats() {
		return classStats;
	}

	public void setClassStats(BaseClassStats classStats) {
		this.classStats = classStats;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
}

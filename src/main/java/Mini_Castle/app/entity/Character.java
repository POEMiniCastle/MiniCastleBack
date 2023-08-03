package Mini_Castle.app.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "character")

public class Character {
	@Id
	@Column(name = "character_id")
	private Integer id;

	@Column(name = "level")
	private Integer level;

	@Column(name = "xp")
	private Integer xp;

	@OneToOne
	@JoinColumn(name = "player_id")
	private Player player;

	@OneToOne
	@JoinColumn(name = "class_id")
	private BaseClassStats classStats;

	@OneToMany(mappedBy = "character")
	private List<Gear> gearList;

	@OneToOne
	@JoinColumn(name = "character_id")
	private Inventory inventory;

	public Character(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<Gear> getGearList() {
		return gearList;
	}

	public void setGearList(List<Gear> gearList) {
		this.gearList = gearList;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
}

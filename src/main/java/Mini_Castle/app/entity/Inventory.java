package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")

public class Inventory {

	@Column(name = "coin")
	private Integer coin;

	@Column(name = "potion")
	private Integer potion;

	@Id
	@PrimaryKeyJoinColumn(name="character_id")
	private Integer id;

	@OneToOne
	@JoinColumn(name="character_id", referencedColumnName = "character_id")
	private Character character;

	public Inventory(){}

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	
}
package Mini_Castle.app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "loot")
@NoArgsConstructor
@Getter
@Setter

public class Loot {

	@Id
	@Column(name = "loot_id")
	private Integer Id;

	@Column(name = "gear_slot_id")
	private Integer gearSlotId;

	@Column(name = "damage")
	private Integer damage;

	@Column(name = "armor")
	private Integer armor;

	@Column(name = "name")
	private String name;

	@JsonIgnore
	@ManyToMany(mappedBy = "loots")
	private List<Card> cards;

}

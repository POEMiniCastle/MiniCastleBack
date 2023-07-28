package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gear")
@NoArgsConstructor
@Getter
@Setter

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
}
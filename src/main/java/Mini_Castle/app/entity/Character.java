package Mini_Castle.app.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "character")
@Getter
@Setter
@NoArgsConstructor

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
}

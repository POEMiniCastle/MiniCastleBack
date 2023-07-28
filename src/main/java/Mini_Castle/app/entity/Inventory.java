package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "inventory")
@Setter
@Getter
@NoArgsConstructor

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
}
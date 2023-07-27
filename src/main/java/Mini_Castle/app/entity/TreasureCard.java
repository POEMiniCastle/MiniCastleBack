package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "treasure_card")
@NoArgsConstructor
@Getter
@Setter

public class TreasureCard {

	@Id
	@PrimaryKeyJoinColumn(name = "card_id")
	private Integer Id;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;

}
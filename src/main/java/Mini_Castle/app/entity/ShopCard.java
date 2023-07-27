package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shopCard")
@NoArgsConstructor
@Getter
@Setter

public class ShopCard {

	@Id
	@PrimaryKeyJoinColumn(name = "card_id")
	private Integer Id;

	@Column(name = "price")
	private Integer price;

	@Column(name = "quantity")
	private Integer quantity;

	@OneToOne
	@JoinColumn(name = "card_id", referencedColumnName = "card_id")
	private Card card;
	
}
package Mini_Castle.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "player")
@NoArgsConstructor
@Getter
@Setter

public class Player {
	@Id
	@Column(name = "player_id")
	private Integer Id;

	@Column(name = "mail")
	private String mail;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "best_score")
	private Integer bestScore;

	@OneToOne(mappedBy = "player")
	private Character character;
}
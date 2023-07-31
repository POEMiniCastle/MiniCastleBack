package Mini_Castle.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player")

public class Player {
	@Id
	@Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "mail")
	private String mail;

	@Column(name = "username")
	private String username;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "best_score")
	private Integer bestScore;

	@OneToOne(mappedBy = "player")
	private Character character;

	public Player() {}
	
	public Player(String mail, String nickname, String passwd, Integer bestScore) {
		this.mail = mail;
		this.username = nickname;
		this.passwd = passwd;
		this.bestScore = bestScore;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNickname() {
		return username;
	}
	public void setNickname(String nickname) {
		this.username = nickname;
	}

	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getBestScore() {
		return bestScore;
	}
	public void setBestScore(Integer bestScore) {
		this.bestScore = bestScore;
	}

	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	
}
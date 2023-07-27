package miniCastle.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "player")

public class Player {
	@Id
	@Column(name = "player_id")
	private Integer playerId;

	@Column(name = "mail")
	private String mail;

	@Column(name = "nickname")
	private String nickname;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "best_score")
	private Integer bestScore;

	@OneToOne(mappedBy = "player")
	private CurrentCard currentCard;

	@OneToOne(mappedBy = "player")
	private BaseClassStats baseClassStats;

	@OneToOne(mappedBy = "player")
	private Character character;

	@OneToOne(mappedBy = "player")
	private Inventory inventory;

	@OneToMany(mappedBy = "player")
	private List<Gear> gearList;

	public Player() {

	}

	public Player(Integer playerId, String mail, String nickname, String passwd, Integer bestScore) {
		this.playerId = playerId;
		this.mail = mail;
		this.nickname = nickname;
		this.passwd = passwd;
		this.bestScore = bestScore;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public CurrentCard getCurrentCard() {
		return currentCard;
	}

	public void setCurrentCard(CurrentCard currentCard) {
		this.currentCard = currentCard;
	}

	public BaseClassStats getBaseClassStats() {
		return baseClassStats;
	}

	public void setBaseClassStats(BaseClassStats baseClassStats) {
		this.baseClassStats = baseClassStats;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<Gear> getGearList() {
		return gearList;
	}

	public void setGearList(List<Gear> gearList) {
		this.gearList = gearList;
	}

}
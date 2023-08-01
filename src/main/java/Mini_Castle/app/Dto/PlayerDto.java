package Mini_Castle.app.Dto;

import Mini_Castle.app.entity.Player;
import Mini_Castle.app.entity.Character;

public class PlayerDto {
	private Integer id;

	private String mail;

	private String username;

	private Integer bestScore;

	private Character character;

	
	public PlayerDto(Player player) {
		this.id = player.getId();
		this.mail = player.getMail();
		this.username = player.getUsername();
		this.bestScore = player.getBestScore();
		this.character = player.getCharacter();
	}
	
	public PlayerDto(Integer id, String mail, String username, Integer bestScore) {
		this.id = id;
		this.mail = mail;
		this.username = username;
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

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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

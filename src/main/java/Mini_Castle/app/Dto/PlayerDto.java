package Mini_Castle.app.Dto;

import java.util.Objects;

import Mini_Castle.app.entity.Player;
import Mini_Castle.app.entity.Character;

public class PlayerDto {
	private Integer id;

	private String username;

	private Integer bestScore;

	private Character character;

	
	public PlayerDto(Player player) {
		this.id = player.getId();
		this.username = player.getUsername();
		this.bestScore = player.getBestScore();
		this.character = player.getCharacter();
	}
	
	public PlayerDto(Integer id, String mail, String username, Integer bestScore) {
		this.id = id;
		this.username = username;
		this.bestScore = bestScore;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerDto other = (PlayerDto) obj;
		return Objects.equals(bestScore, other.bestScore) && Objects.equals(username, other.username);
	}
}

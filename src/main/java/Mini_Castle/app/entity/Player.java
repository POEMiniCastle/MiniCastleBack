package Mini_Castle.app.entity;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;

@Entity
@Table(name = "player")

public class Player implements UserDetails{
	
	private static final long serialVersionUID = 1L;

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

	public String getUsername() {
		return username;
	}
	public void setUsername(String nickname) {
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() { return Set.of(); }
	@Override
	public boolean isAccountNonExpired() { return true; }
	@Override
	public boolean isAccountNonLocked() { return true; }
	@Override
	public boolean isCredentialsNonExpired() { return true; }
	@Override
	public boolean isEnabled() { return true; }
	@Override
	public String getPassword() { return this.passwd; }

	@Override
	public String toString() {
		return "Player [id=" + id + ", mail=" + mail + ", username=" + username + ", passwd=" + passwd + ", bestScore="
				+ bestScore + ", character=" + character + "]";
	}
	
	public String stringify() {
		return "{'id': " + this.id 
				+ ", 'username':" + this.username
				+ ", 'bestScore':" + this.bestScore
				+ ", 'character':" + this.character
				+ "}";
	}
	
}
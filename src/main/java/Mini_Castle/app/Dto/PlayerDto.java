package Mini_Castle.app.Dto;

public class PlayerDto {

	private String mail;

	private String username;

	private String passwd;

	
	public PlayerDto(String mail, String username, String passwd) {
		this.mail = mail;
		this.username = username;
		this.passwd = passwd;
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

}

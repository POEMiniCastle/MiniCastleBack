package Mini_Castle.app.Dto;

public class RegistrationPlayerDto {

	private String mail;

	private String username;

	private String passwd;

	
	public RegistrationPlayerDto(String mail, String username, String passwd) {
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

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}

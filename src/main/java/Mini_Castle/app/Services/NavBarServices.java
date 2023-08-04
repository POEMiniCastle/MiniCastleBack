package Mini_Castle.app.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.NavBarDto;

@Service
public class NavBarServices {

	public List<NavBarDto> getAllContent(){
		List<NavBarDto> navAll = new ArrayList<>();
		navAll.add(new NavBarDto("", "explore", "Home"));
		navAll.add(new NavBarDto("play", "skull", "Play"));
		navAll.add(new NavBarDto("deconnexion", "logout", "LogOut"));
		return navAll;
	}

	public List<NavBarDto> getMinimalContent(){
		List<NavBarDto> navMini = new ArrayList<>();
		navMini.add(new NavBarDto("", "explore", "Home"));
		navMini.add(new NavBarDto("register", "person_add", "Register"));
		navMini.add(new NavBarDto("connexion", "login", "LogIn"));
		return navMini;
	}
}
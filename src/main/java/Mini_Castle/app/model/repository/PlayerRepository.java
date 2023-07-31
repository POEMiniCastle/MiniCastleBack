package Mini_Castle.app.model.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Mini_Castle.app.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	ArrayList<Player> findAll();
	
	Player findByMail(String mail);
	
	Player findByUsername(String username);
}

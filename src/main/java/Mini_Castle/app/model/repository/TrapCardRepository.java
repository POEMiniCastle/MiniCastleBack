package Mini_Castle.app.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Mini_Castle.app.entity.TrapCard;

public interface TrapCardRepository extends JpaRepository<TrapCard, Integer> {
	
	List<TrapCard> findAllTrapcardByOrderByIdAsc();
}

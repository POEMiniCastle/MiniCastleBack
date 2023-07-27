package Mini_Castle.app.model.repository;

import Mini_Castle.app.entity.MonsterCard;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonsterCardRepository extends JpaRepository<MonsterCard, Integer> {
    List<MonsterCard> findAllMonsterCardByOrderByIdAsc();

    MonsterCard findMonsterCardById(int id);
	
}

package Mini_Castle.app.model.repository;

import Mini_Castle.app.entity.Card;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CardRepository extends JpaRepository<Card, Integer> {
    List<Card> findAllCardByOrderByIdAsc();

    Card findCardById(int id);
}
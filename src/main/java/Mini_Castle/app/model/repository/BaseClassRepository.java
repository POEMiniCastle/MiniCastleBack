package Mini_Castle.app.model.repository;

import Mini_Castle.app.entity.Baseclassstats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MiniCastle_BaseClass_Repository extends JpaRepository<Baseclassstats, Integer> {
    List<Baseclassstats> findAllBaseClassByOrderByIdAsc();
    Baseclassstats findBaseClassById(int id);
}
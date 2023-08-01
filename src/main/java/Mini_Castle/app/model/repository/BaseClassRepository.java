package Mini_Castle.app.model.repository;

import Mini_Castle.app.entity.BaseClassStats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseClassRepository extends JpaRepository<BaseClassStats, Integer> {
    List<BaseClassStats> findAllBaseClassByOrderByIdAsc();
    List<BaseClassStats> findAll();
    BaseClassStats findBaseClassById(Integer id);
}
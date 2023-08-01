package Mini_Castle.app.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mini_Castle.app.Dto.ClassStatsDto;
import Mini_Castle.app.entity.BaseClassStats;
import Mini_Castle.app.model.repository.BaseClassRepository;

@Service
public class ClassStatsServices {

    @Autowired
    private BaseClassRepository repository;

    public List<BaseClassStats> getAllClassStats(){
        return repository.findAll();
    }

    public List<ClassStatsDto> findAllBaseClassByOrderByIdAsc(){
        List<ClassStatsDto> baseClass = new ArrayList<>();
        for(BaseClassStats c : getAllClassStats())
        baseClass.add(new ClassStatsDto(c.getId(),c.getName(),c.getBase_hp(),c.getBase_armor(),
        c.getBase_damage(),c.getSkill_name(),c.getSkill_description(),c.getImagePath()));
        
        return baseClass;
    }

}

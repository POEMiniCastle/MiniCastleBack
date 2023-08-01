package Mini_Castle.app.Controller;

import Mini_Castle.app.Dto.ClassStatsDto;
import Mini_Castle.app.Services.ClassStatsServices;
import Mini_Castle.app.entity.BaseClassStats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
//@RequestMapping("api/class")

public class BaseClassController {
	@Autowired
    private ClassStatsServices service;

    public List<BaseClassStats> listAllBaseClassStats(){
        return service.getAllClassStats();
    }

    @GetMapping("api/class")
    public List<ClassStatsDto> listAllBaseClass(){ 
        return  service.findAllBaseClassByOrderByIdAsc();}
}

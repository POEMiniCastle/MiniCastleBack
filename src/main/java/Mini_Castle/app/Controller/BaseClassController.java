package Mini_Castle.app.Controller;

import Mini_Castle.app.entity.BaseClassStats;
import Mini_Castle.app.model.repository.BaseClassRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/class")

public class BaseClassController {
	@Autowired
    private BaseClassRepository repository;

    @GetMapping
    public List<BaseClassStats> listAllBaseClass(){ return  repository.findAllBaseClassByOrderByIdAsc();}
}

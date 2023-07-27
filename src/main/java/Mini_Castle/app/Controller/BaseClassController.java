package Mini_Castle.app.Controller;

import Mini_Castle.app.entity.BaseClassStats;
import Mini_Castle.app.model.repository.BaseClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/class")

public class BaseClassController {
    private final BaseClassRepository repository;

    @GetMapping
    public List<BaseClassStats> listAllBaseClass(){ return  repository.findAllBaseClassByOrderByIdAsc();}
}

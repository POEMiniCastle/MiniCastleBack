package Mini_Castle.app.Controller;

import Mini_Castle.app.entity.Baseclassstats;
import Mini_Castle.app.model.repository.MiniCastle_BaseClass_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/class")

public class MiniCastleBaseClassController {
    private final MiniCastle_BaseClass_Repository repository;

    @GetMapping
    public List<Baseclassstats> listAllBaseClass(){ return  repository.findAllBaseClassByOrderByIdAsc();}
}

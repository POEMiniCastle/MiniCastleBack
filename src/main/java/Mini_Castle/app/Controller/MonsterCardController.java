package Mini_Castle.app.Controller;

import Mini_Castle.app.entity.MonsterCard;
import Mini_Castle.app.model.repository.MonsterCardRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/monstercard")

public class MonsterCardController {
	@Autowired
    private MonsterCardRepository repository;

    @GetMapping
    public List<MonsterCard> listAllMonstercard(){ return  repository.findAllMonstercardByOrderByCardIdAsc();}

}

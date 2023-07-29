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

public class MonsterCardController {
	@Autowired
    private MonsterCardRepository repository;

    @GetMapping("api/monstercard")
    public List<MonsterCard> listAllMonstercard(){ return  repository.findAllMonstercardByOrderByCardIdAsc();}

}

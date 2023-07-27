package Mini_Castle.app.Controller;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.model.repository.MiniCastle_Card_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/card")

public class MiniCastleCardController {
    private final MiniCastle_Card_Repository repository;

    @GetMapping
    public List<Card> listAllCard(){ return  repository.findAllCardByOrderByIdAsc();}

}





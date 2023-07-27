package Mini_Castle.app.Controller;

import Mini_Castle.app.entity.Card;
import Mini_Castle.app.model.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/card")

public class CardController {
    private final CardRepository repository;

    @GetMapping
    public List<Card> listAllCard(){ return  repository.findAllCardByOrderByIdAsc();}

}





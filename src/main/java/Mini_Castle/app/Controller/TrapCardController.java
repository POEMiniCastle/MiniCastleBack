package Mini_Castle.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Mini_Castle.app.entity.TrapCard;
import Mini_Castle.app.model.repository.TrapCardRepository;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor

public class TrapCardController {

	@Autowired
	TrapCardRepository repository;
	
    @GetMapping("api/trapcard")
    public List<TrapCard> listAllTrapcard(){ return  repository.findAllTrapcardByOrderByIdAsc();}

}

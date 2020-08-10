package no.data.cards;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/card")
public class CardsController {

    @PostMapping
    public void createCard(){
        System.out.println("Creating card");
    }

    @GetMapping
    public void readCards(){
        System.out.println("Getting cards");
    }
}

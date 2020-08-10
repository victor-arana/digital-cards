package no.data.cards;

import org.springframework.web.bind.annotation.*;

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

    @PutMapping
    public void updateCard(){
        System.out.println("Updating card");
    }

    @DeleteMapping
    public void deleteCard(){
        System.out.println("Deleting card");
    }
}

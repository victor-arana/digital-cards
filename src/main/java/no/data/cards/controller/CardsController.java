package no.data.cards.controller;

import no.data.cards.model.Card;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/card")
public class CardsController {

    private static List<Card> cards = new ArrayList<>();

    static{
        Card card = new Card();
        card.setId(1);
        card.setTitularName("Victor Jose Arana Rodriguez");
        card.setEntityName("Space Money");
        card.setCardNumber("1234-1234-1234-1324");
        card.setMark("Space Money");
        card.setExpirationDate("10/12");

        cards.add(card);
    }

    @PostMapping
    public void createCard(){
        System.out.println("Creating card");
    }

    @GetMapping
    public List<Card> readCards(){
        return cards;
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

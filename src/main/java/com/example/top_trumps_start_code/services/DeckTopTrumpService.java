package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Deck;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DeckTopTrumpService {

    Deck deck;

    public DeckTopTrumpService(Deck deck){
        this.deck = deck;
    }

    private boolean checkEligibility(Card card){
        if(card.getSuit().equals(Suit.HEARTS)){
          int rank = card.getCardValue() - 2;
          if(deck.getHearts().get(rank).equals(false)){
              return false;
          }
        }
        if(card.getSuit().equals(Suit.DIAMONDS)) {
            int rank = card.getCardValue() - 2;
            if (deck.getDiamonds().get(rank).equals(false)) {
                return false;
            }
        }
        if(card.getSuit().equals(Suit.CLUBS)) {
            int rank = card.getCardValue() - 2;
            if (deck.getClubs().get(rank).equals(false)) {
                return false;
            }
        }
        if(card.getSuit().equals(Suit.SPADES)) {
            int rank = card.getCardValue() - 2;
            if (deck.getSpades().get(rank).equals(false)) {
                return false;
            }
        }
        return true;
    }
    public Reply checkWinner(ArrayList<Card> match){
//        checks if card is eligible
        if (checkEligibility(match.get(0))|| checkEligibility(match.get(1))){
            return "Card"
        }
//        Checks which card ranks higher or draws
        if(match.get(0).getRank().equals(match.get(1).getRank())){
            return new Reply("It's a draw");
        } else if (match.get(0).getCardValue() > match.get(1).getCardValue()){
            return new Reply(String.format("%s of %s wins!", match.get(0).getRank().toString(), match.get(0).getSuit().toString()));
        }
        return new Reply(String.format("%s of %s wins!", match.get(1).getRank().toString(), match.get(1).getSuit().toString()));
    }
}

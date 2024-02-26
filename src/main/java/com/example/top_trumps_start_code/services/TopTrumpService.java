package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpService {

    public TopTrumpService(){
    }
    public Reply checkWinner(ArrayList<Card> match){
        if(match.get(0).getRank().equals(match.get(1).getRank())){
            return new Reply("It's a draw");
        } else if (match.get(0).getCardValue() > match.get(1).getCardValue()){
            return new Reply(String.format("%s of %s wins!", match.get(0).getRank().toString(), match.get(0).getSuit().toString()));
        }
        return new Reply(String.format("%s of %s wins!", match.get(1).getRank().toString(), match.get(1).getSuit().toString()));
    }
}

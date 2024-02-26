package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Deck;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.services.TopTrumpService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/topTrumps")
public class TopTrumpsController {

    @Autowired
    TopTrumpService topTrumpService;

    @PostMapping
    public ResponseEntity<Reply> createGame(@RequestBody ArrayList<Card> match){
        // Create game
        // reply = topTrumpsService.checkWinner(match);
        // return new ResponseEntity<>(reply, HttpStatus.OK);
        Reply reply = topTrumpService.checkWinner(match);
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @PostMapping(value = "/deckGame")
    public ResponseEntity<Deck> createDeck(){
        Deck deck = new Deck();
        return new ResponseEntity<>(deck,HttpStatus.CREATED);
    }
}

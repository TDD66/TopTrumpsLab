package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/games")
public class TopTrumpsController {


    @PostMapping
    public ResponseEntity<Reply> createGame(@RequestBody ArrayList<Card> match){
        // Create game
        // reply = topTrumpsService.checkWinner(match);
        // return new ResponseEntity<>(reply, HttpStatus.OK);
    }
}

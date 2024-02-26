package com.example.top_trumps_start_code.models;

import java.util.ArrayList;

public class Deck {

    ArrayList<Boolean> hearts;
    ArrayList<Boolean> diamonds;
    ArrayList<Boolean> clubs;
    ArrayList<Boolean> spades;

    public Deck(){
        this.hearts = new ArrayList<>();
        this.clubs = new ArrayList<>();
        this.diamonds = new ArrayList<>();
        this.spades = new ArrayList<>();

        for(int i = 0; i < 13; i++){
            this.hearts.add(true);
        }

        for(int i = 0; i < 13; i++){
            this.clubs.add(true);
        }

        for(int i = 0; i < 13; i++){
            this.diamonds.add(true);
        }

        for(int i = 0; i < 13; i++) {
            this.spades.add(true);
        }
    }

    public ArrayList<Boolean> getHearts() {
        return hearts;
    }

    public void setHearts(ArrayList<Boolean> hearts) {
        this.hearts = hearts;
    }

    public ArrayList<Boolean> getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(ArrayList<Boolean> diamonds) {
        this.diamonds = diamonds;
    }

    public ArrayList<Boolean> getClubs() {
        return clubs;
    }

    public void setClubs(ArrayList<Boolean> clubs) {
        this.clubs = clubs;
    }

    public ArrayList<Boolean> getSpades() {
        return spades;
    }

    public void setSpades(ArrayList<Boolean> spades) {
        this.spades = spades;
    }
}

// Hearts : [true, true, true, true, true ...... true]
// User plays 2 of hearts
// First check if 2 of hearts is true
// If it's true play the card and change it to false
// Hearts : [false, true, true .... true]
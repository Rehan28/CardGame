package com.rehan.game.highlow;

public enum Suit {
    DIMONDS("♦️"),
    HEARTS("♥️"),
    CLUBS("♣️"),
    SPADES("♠️");

    private final String value;
    Suit(String value){
        this.value = value;
    }
    @Override
    public String toString(){
        return value;
    }
}

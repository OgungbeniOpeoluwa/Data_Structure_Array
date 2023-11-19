package chapter7.DeckGame;

import java.util.ArrayList;

public class Players {
    private  String name;
    DeckOfCard deckOfCard = new DeckOfCard();
    public  void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }
    public void play(){
        deckOfCard.shuffle();
    }

}

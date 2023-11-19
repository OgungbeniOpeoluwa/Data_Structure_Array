package chapter7.DeckGame;

import java.util.ArrayList;

public class DeckCardsMain {
    public static void main(String[] args) {
        DeckOfCard deckOfCard = new DeckOfCard();
        int counter = 0;
        Card [] myDeckCard = new Card[5];
        deckOfCard.shuffle();
        for(int count = 1;count <=52; count++){
            Card result = deckOfCard.dealCard();
            System.out.printf("%-19s",result);
            myDeckCard[counter] = result;
            counter++;



            if(count % 5 ==0){
                counter = 0;
                System.out.println();
                if(deckOfCard.isPair(myDeckCard))System.out.println(" A Pair");
                if(deckOfCard.twoPairs(myDeckCard))System.out.println(" Two Pairs ");
                if(deckOfCard.threeOfAKind(myDeckCard))System.out.println(" Three Of A kind ");
                if(deckOfCard.fourOfAKind(myDeckCard))System.out.println(" Four Of A Kind");
                if(deckOfCard.isAflush(myDeckCard))System.out.println(" A Flush");
                if(deckOfCard.isAStraight(myDeckCard))System.out.println(" A Straight");
                if(deckOfCard.isAFullHouse(myDeckCard))System.out.println("Full house");
                myDeckCard = new Card[5];
            }

            }
    }
}

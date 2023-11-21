package chapter7.DeckGame;

import java.util.Arrays;
import java.util.Scanner;

public class DealerShuffleMain {
    public static void main(String[] args) {
        DeckOfCard deckOfCard = new DeckOfCard();
        deckOfCard.shuffle();
        Card [] dealer = new Card[5];
        for(int count = 0; count < 5; count ++){
            dealer[count] = deckOfCard.dealCard();
        }

        DealerShuffle dealerShuffle = new DealerShuffle();
        int result = dealerShuffle.checkCards(dealer);
        System.out.println(Arrays.toString(dealer));
        dealerShuffle.card(result);
        if(result > 0){
            int numberOfCard = dealerShuffle.returnResponse();
            int [] indexCard = dealerShuffle.arrayOfIndexOfCardToChange(numberOfCard);
            dealer = dealerShuffle.changeCard(dealer,indexCard);
            System.out.println(Arrays.toString(dealer));
            result = dealerShuffle.checkCards(dealer);
        }
        if(result > 0){
            System.out.println("Busted");
            dealerShuffle.card(result);
        }
    }
}

package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DealerShuffle {
    final static int gameRule = 21;

    public static int changeDealerHand(Card[] card) {
        DeckOfCard deckOfCard = new DeckOfCard();
        int total = 0;
        int [] result = deckOfCard.sortFaceValueToNumbers(card);
        for(int numb : result){
            total += numb;
        }
        return total;

    }

    public static Card [] changeCard( Card[] card,int [] numbers) {
        DeckOfCard deckOfCard = new DeckOfCard();
        boolean[] result = TwoHandPlayer.checkForElegibility(card);
        System.out.println(Arrays.toString(result));
        if (!(result[0])) {
            for (int count : numbers) {
                card[count] = deckOfCard.dealCard();
            }
        }
        result = TwoHandPlayer.checkForElegibility(card);
        if (!result[0]){

        }
        return card;
    }

    public static void main(String[] args) {
        Queue <Integer> name = new ArrayBlockingQueue<>(3);
        System.out.println(name.add(34));
        name.add(34);
        name.add(34);
        System.out.println(name.add(56));
        System.out.println(name);
        System.out.println(name.size());
    }
}

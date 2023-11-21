package chapter7.DeckGame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DealerShuffleTest {
    @Test
    public void testThatDealerChangeOriginalHandOfGame(){
        Card[] card = new Card[5];
        DealerShuffle dealerShuffle = new DealerShuffle();
        card[0] = new Card(FaceCard.QUEEN, Suites.HEART);
        card[1] = new Card(FaceCard.EIGHT, Suites.SPADES);
        card[2] = new Card(FaceCard.QUEEN, Suites.DIAMONDS);
        card[3] = new Card(FaceCard.KING, Suites.DIAMONDS);
        card[4] = new Card(FaceCard.QUEEN, Suites.CLUBS);
        int [] remove = {1,3};
        System.out.println(Arrays.toString(dealerShuffle.changeCard(card, remove)));
    }
}
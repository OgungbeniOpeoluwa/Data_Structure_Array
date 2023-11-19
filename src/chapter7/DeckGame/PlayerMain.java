package chapter7.DeckGame;

import java.util.Arrays;

public class PlayerMain {
    public static void main(String[] args) {
        Players [] plays = {new Players(),new Players()};
        Card [] player = new Card[5];
        Card [] player2 = new Card[5];
        plays[0].play();
        plays[1].play();
        for(int count = 0; count < 5 ; count++){
            player[count] = plays[0].deckOfCard.dealCard();
            player2[count] = plays[1].deckOfCard.dealCard();
        }
        System.out.println("PLayer 1 Cards " + Arrays.toString(player));
        System.out.println("PLayer 2 Cards " + Arrays.toString(player2));
        System.out.println(TwoHandPlayer.determineHandThatIsBetter(player,player2));




    }
}

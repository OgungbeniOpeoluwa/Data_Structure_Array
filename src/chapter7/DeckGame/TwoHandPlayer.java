package chapter7.DeckGame;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoHandPlayer {

    public  static  String determineHandThatIsBetter(Card [] player1,Card [] player2) {
       int playerOne = returnIndexOfTrue(checkForElegibility(player1));
        int playerTwo = returnIndexOfTrue(checkForElegibility(player2));
        if(playerOne < playerTwo)return "player 1 won";
        else if(playerOne == playerTwo)return "It is a tie";
        else return "Player 2 won";
    }



    private static int returnIndexOfTrue(boolean [] result){
        int counts = 10;
        for(int count = 0; count < result.length; count++){
            if(result[count]){
                counts = count;
            }
        }
        return counts;
    }


    public  static  boolean [] checkForElegibility(Card [] card){
        DeckOfCard deckOfCard = new DeckOfCard();
        boolean [] result = new boolean[7];
            if(deckOfCard.fourOfAKind(card)){
               result[0] = true;
            }
          else if(deckOfCard.isAFullHouse(card)){
                result[1] =  true;
            }
            else if(deckOfCard.isAflush(card)){
                result[2] =  true;
            }
            else if(deckOfCard.isAStraight(card)){
                result[3] =  true;
            }
            else if(deckOfCard.threeOfAKind(card)){
                result[4] =  true;
            }
            else if (deckOfCard.twoPairs(card)) {
                result[5] = true;
            } else if (deckOfCard.isPair(card)) {
                result[6] = true;
            }
            return result;
    }




}

package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.Arrays;

public class DealerAndPlayerHand {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        DeckOfCard deckOfCard = new DeckOfCard();
        DeckOfCard computerGame = new DeckOfCard();

        deckOfCard.shuffle();
        computerGame.shuffle();

        Card [] player = new Card [5];
        Card [] dealer = new Card[5];


        for(int count = 0; count < 5; count++){
            player[count] = deckOfCard.dealCard();
            dealer[count] = computerGame.dealCard();
        }


        DealerShuffle shuffle = new DealerShuffle();
        int player1 = shuffle.checkCards(player);
        int dealerCard = shuffle.checkCards(dealer);
        System.out.println(Arrays.toString(dealer));
        System.out.println(Arrays.toString(player));


        if(dealerCard > 0){
            int number = random.nextInt(1,4);
            int [] arrays = shuffle.arrayOfIndexOfCardToChangeForDealer(number);
            dealer = shuffle.changeCard(dealer,arrays);
            dealerCard = shuffle.checkCards(dealer);
            System.out.println(Arrays.toString(dealer));
        }


        if(player1 > 0){
            int numberOfCard = shuffle.returnResponse();
            int [] indexCard = shuffle.arrayOfIndexOfCardToChange(numberOfCard);
            player = shuffle.changeCard(player,indexCard);
            player1 = shuffle.checkCards(player);
            System.out.println(Arrays.toString(player));

        }
        TwoHandPlayer.determineHandThatIsBetter(dealer,player);





    }
}

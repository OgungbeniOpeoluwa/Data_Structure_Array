package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.Arrays;

public class DealerAndPlayerHand {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        DealerShuffle shuffle = new DealerShuffle();
        Players player = new Players();
        player.setName("Ope");

        DeckOfCard deckOfCard = new DeckOfCard();
        DeckOfCard computerGame = new DeckOfCard();

        player.play();
        computerGame.shuffle();

        Card [] playerCards = new Card [5];
        Card [] dealer = new Card[5];
        int computerScore = 0;
        int playerScore = 0;
         int counts = 0;

        while(counts < 20) {
            for (int count = 0; count < 5; count++) {
                playerCards[count] = deckOfCard.dealCard();
                dealer[count] = computerGame.dealCard();
            }


            int player1 = shuffle.checkCards(playerCards);
            int dealerCard = shuffle.checkCards(dealer);
            System.out.print("Hello " + player.getName() + " " + "your Card is a " );
            shuffle.card(player1);
            System.out.println(" ");

            if (dealerCard > 0) {
                int number = random.nextInt(1, 4);
                int[] arrays = shuffle.arrayOfIndexOfCardToChangeForDealer(number);
                dealer = shuffle.changeCard(dealer, arrays);
            }
            if (player1 > 0) {
                int numberOfCard = shuffle.returnResponse();
                int[] indexCard = shuffle.arrayOfIndexOfCardToChange(numberOfCard);
                playerCards = shuffle.changeCard(playerCards, indexCard);
                player1 = shuffle.checkCards(playerCards);
                shuffle.card(player1);
            }
            computerScore++;
            playerScore++;
            System.out.println(TwoHandPlayer.determineHandThatIsBetter(dealer, playerCards, "Computer", player.getName()));
            counts++;
        }

        if(computerScore > playerScore){
            System.out.println("Computer won");
        } else if (playerScore > computerScore) {
            System.out.println(player.getName() + " Won");
        }
        else{
            System.out.println("It's a tie");
        }


    }
}

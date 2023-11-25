package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.Scanner;

public class DealerShuffle {
    public Card [] changeCard( Card[] card,int [] numbers) {
        DeckOfCard deckOfCard = new DeckOfCard();
        deckOfCard.shuffle();
            for (int count : numbers) {
                card[count] = deckOfCard.dealCard();
            }
        return card;
    }

    public  void  card (int number){
        switch(number) {
            case 0 -> System.out.print("FOUR OF A KIND");
            case 1 -> System.out.print("FULL HOUSE");
            case 2 -> System.out.print("FLUSH");
            case 3 -> System.out.print("STRAIGHT");
            case 4 -> System.out.print("THREE OF A KIND ");
            case 5 -> System.out.print("TWO KIND");
            case 6 -> System.out.print("A PAIR");
        }

        }

        public  int checkCards(Card[] card){
            boolean [] result= TwoHandPlayer.checkForElegibility(card);
            return TwoHandPlayer.returnIndexOfTrue(result);
    }
    public int returnResponse(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Will like to change your card: ");
        String input = scanner.next();
        if(input.equalsIgnoreCase("Yes")){
            System.out.println("How many cards are you swapping ");
            result = scanner.nextInt();
        }
        return result;
    }
    public int[] arrayOfIndexOfCardToChange(int number){
        Scanner scanner = new Scanner(System.in);
        int [] cardIndex = new int[number];
        for(int count = 0; count < number ; count++){
            System.out.println("Enter Card Index :");
            cardIndex[count] = scanner.nextInt();
        }
        return cardIndex;
    }

    public int[] arrayOfIndexOfCardToChangeForDealer(int number){
        SecureRandom random = new SecureRandom();
        int [] cardIndex = new int[number];
        for(int count = 0; count < number ; count++){
            int result = random.nextInt(0,5);
            cardIndex[count] = result;
        }
        return cardIndex;
    }

    }






package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;

public class DeckOfCard {

   private static SecureRandom random = new SecureRandom();
    private static final int NUMBER_OF_CARD = 52;
    private Card [] deck = new Card[NUMBER_OF_CARD];
    private int currentCard = 0;
    FaceCard [] faces;

    public DeckOfCard(){
        faces =  FaceCard.values();
        Suites[] suits = Suites.values();
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new  Card(faces[count % 13], suits[count / 13]);
        }
    }
    public FaceCard [] getFaces(){
        return  faces;
    }
    public void shuffle(){
        currentCard = 0;
        for(int first = 0; first < deck.length; first++){
            int second = random.nextInt(NUMBER_OF_CARD);
            Card temp = deck[first];
            deck[first]  = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else{
            return  null;
        }
    }
    public boolean  isPair( Card [] cardList){
        boolean result = false;
           for(int count = 0; count < cardList.length;count++){
               for(int counter = count+1; counter < cardList.length;counter++){
                   if(cardList[count].getFace().equals(cardList[counter].getFace())) {
                       result = true;
                       break;
                   }
               }
           }
           return result;
    }

    public boolean  threeOfAKind(Card [] cardsList){
        int counters = 0;
        boolean result = false;
        for(int count = 0; count < cardsList.length;count++){
            for(int counter = count; counter < cardsList.length;counter++){
                if(cardsList[count].getFace().equals(cardsList[counter].getFace())){
                    counters ++;
                }
            }
            if(counters == 3) {
                result = true;
                break;}
            counters = 0;
        }
        return result;
    }
    public boolean  fourOfAKind(Card [] cardList){
        int counters = 0;
        boolean result = false;
        for(int count = 0; count < cardList.length;count++){
            for(int counter = count; counter < cardList.length;counter++){
                if(cardList[count].getFace().equals(cardList[counter].getFace())){
                    counters ++;
                }
            }
            if(counters == 4) {
                result = true;
                break;}
            counters = 0;
        }
        return result;
    }
    public boolean  isAflush( Card [] cardList){
        boolean result = true;
        for(int count = 0; count < cardList.length;count++){
            for(int counter = count+1; counter < cardList.length;counter++) {
                if (!(cardList[count].getSuites().equals(cardList[counter].getSuites()))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean twoPairs(Card [] myDeckSuites) {
        boolean answer = false;
        int counter = 0;
        int result = 0;
        for(int count = 0; count< myDeckSuites.length;count++){
            for(int counts = count; counts < myDeckSuites.length;counts++){
                if(myDeckSuites[count].getFace().equals(myDeckSuites[counts].getFace())){
                    counter++;
                }
            }
            if(counter == 2){
                result++;
            }
            if(counter > 2){
                answer = false;
                break;
            }
            counter = 0;
        }
        if(result == 2){
            answer = true;
        }
        return answer;
    }

    public boolean isAStraight(Card [] myDeckSuites) {
       // HashMap<FaceCard, Integer> result = getStringIntegerHashMap();
        int [] results =  sortFaceValueAfterFaceValuesAreInDigitToDescendingOrder(sortFaceValueToNumbers(myDeckSuites));
        int counter = results[0];
        boolean answer = true;
       for(int count = 1; count < results.length; count++){
            counter +=1;
            if(results[count] != counter){
                answer = false;
           }
        }
        return answer;
    }
    public boolean isAFullHouse(Card [] myDeckSuites) {
        HashSet <FaceCard> result = new HashSet<>();
        for (int count = 0; count < myDeckSuites.length; count++){
            result.add(myDeckSuites[count].getFace());
        }
        if (result.size() == 2)return true;
        else return false;
    }

    public  int [] sortFaceValueToNumbers(Card [] myDeckSuites) {
        HashMap <FaceCard, Integer> result = getStringIntegerHashMap();
        int [] arrays = new int[myDeckSuites.length];
        for(int count = 0; count < myDeckSuites.length; count++ ){
            arrays[count] = result.get(myDeckSuites[count].getFace());
        }
        return arrays;
    }

    private HashMap<FaceCard, Integer> getStringIntegerHashMap() {
        HashMap <FaceCard, Integer> result = new HashMap<>();
        for(int count = 0;count < 13;count++){
            result.put(getFaces()[count], (count+1) );

        }
        return result;
    }

    private int [] sortFaceValueAfterFaceValuesAreInDigitToDescendingOrder(int [] faceValues){
        for(int count = 0; count < faceValues.length;count++){
            for(int counts = 0; counts< faceValues.length; counts++){
                if(faceValues[count] < faceValues[counts]){
                    int temp = faceValues[count];
                    faceValues[count] = faceValues[counts];
                    faceValues[counts] = temp;
                }
            }
        }
        return faceValues;
    }


}

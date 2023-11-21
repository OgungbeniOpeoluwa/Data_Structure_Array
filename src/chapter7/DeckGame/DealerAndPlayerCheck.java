package chapter7.DeckGame;

public class DealerAndPlayerCheck {
    public static String checkHand(Card [] dealer, Card [] player){
       return TwoHandPlayer.determineHandThatIsBetter(dealer,player);

    }
}

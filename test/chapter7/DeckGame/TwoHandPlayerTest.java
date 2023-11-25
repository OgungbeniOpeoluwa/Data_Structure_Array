package chapter7.DeckGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoHandPlayerTest {
    @Test
    public void testForCardElegibility(){
        Card [] player1 = new Card[5];
        player1[0] = new Card(FaceCard.ACE, Suites.HEART);
        player1[1] = new Card(FaceCard.ACE , Suites.SPADES);
        player1[2] = new Card(FaceCard.ACE , Suites.DIAMONDS);
        player1[3] = new Card(FaceCard.ACE , Suites.HEART);
        player1[4] = new Card(FaceCard.QUEEN , Suites.HEART);
        boolean [] result = {true, false, false , false, false, false, false};
        assertArrayEquals(result,TwoHandPlayer.checkForElegibility(player1));
    }
    @Test
    public void testForTheWinner(){
        Card [] player1 = new Card[5];
        player1[0] = new Card(FaceCard.ACE, Suites.HEART);
        player1[1] = new Card(FaceCard.ACE , Suites.SPADES);
        player1[2] = new Card(FaceCard.ACE , Suites.DIAMONDS);
        player1[3] = new Card(FaceCard.ACE , Suites.HEART);
        player1[4] = new Card(FaceCard.QUEEN , Suites.HEART);
        Card [] player2 = new Card[5];
        player2[0] = new Card(FaceCard.ACE , Suites.HEART);
        player2[1] = new Card(FaceCard.DEUCE , Suites.DIAMONDS);
        player2[2] = new Card(FaceCard.THREE , Suites.DIAMONDS);
        player2[3] = new Card(FaceCard.FIVE , Suites.HEART);
        player2[4] = new Card(FaceCard.FOUR , Suites.HEART);
        String result = "player 1 won";
        assertEquals(result,TwoHandPlayer.determineHandThatIsBetter(player1,player2,"ope","Ayo"));
    }

    @Test
    public void testForTheWhenItSameCardTest(){
        Card [] player1 = new Card[5];
        player1[0] = new Card(FaceCard.ACE, Suites.HEART);
        player1[1] = new Card(FaceCard.ACE , Suites.SPADES);
        player1[2] = new Card(FaceCard.ACE , Suites.DIAMONDS);
        player1[3] = new Card(FaceCard.ACE , Suites.HEART);
        player1[4] = new Card(FaceCard.QUEEN , Suites.HEART);
        Card [] player2 = new Card[5];
        player2[0] = new Card(FaceCard.ACE, Suites.HEART);
        player2[1] = new Card(FaceCard.ACE , Suites.SPADES);
        player2[2] = new Card(FaceCard.ACE , Suites.DIAMONDS);
        player2[3] = new Card(FaceCard.ACE , Suites.HEART);
        player2[4] = new Card(FaceCard.QUEEN , Suites.HEART);
        String result = "It is a tie";
        assertEquals(result,TwoHandPlayer.determineHandThatIsBetter(player1,player2,"Delighted","Tobi"));
    }



}
package chapter7.DeckGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardTest {
    @Test
    public void testIsNotAFlush() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.ACE, Suites.CLUBS);
        myDeckSuites[1] = new Card(FaceCard.DEUCE, Suites.CLUBS);
        myDeckSuites[2] = new Card(FaceCard.THREE, Suites.DIAMONDS);
        myDeckSuites[3] = new Card(FaceCard.FOUR, Suites.DIAMONDS);
        myDeckSuites[4] = new Card(FaceCard.FIVE, Suites.CLUBS);
        assertFalse(deckOfCard.isAflush(myDeckSuites));

    }

    @Test
    public void testIsAFlush() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.ACE, Suites.CLUBS);
        myDeckSuites[1] = new Card(FaceCard.DEUCE, Suites.CLUBS);
        myDeckSuites[2] = new Card(FaceCard.THREE, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.FOUR, Suites.CLUBS);
        myDeckSuites[4] = new Card(FaceCard.FIVE, Suites.CLUBS);
        assertTrue(deckOfCard.isAflush(myDeckSuites));
    }

    @Test
    public void testHandISFourOfAKind() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.DEUCE, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.QUEEN, Suites.SPADES);
        assertTrue(deckOfCard.fourOfAKind(myDeckSuites));

    }

    @Test
    public void testHandISNotFourOfAKind() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.DEUCE, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.JACK, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.QUEEN, Suites.SPADES);
        assertFalse(deckOfCard.fourOfAKind(myDeckSuites));

    }

    @Test
    public void testHandISNotThreeOfAKind() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.DEUCE, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.JACK, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.QUEEN, Suites.SPADES);
        assertTrue(deckOfCard.threeOfAKind(myDeckSuites));
    }

    @Test
    public void testHandHasTwoPairs() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.DEUCE, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.DEUCE, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.JACK, Suites.SPADES);
        assertTrue(deckOfCard.twoPairs(myDeckSuites));
    }

    @Test
    public void testHandDoesNotHaveTwoPairs() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.QUEEN, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.JACK, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.QUEEN, Suites.SPADES);
        assertFalse(deckOfCard.twoPairs(myDeckSuites));
    }

    @Test
    public void testHandHasAStraightPairs() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.ACE, Suites.HEART);
        myDeckSuites[1] = new Card(FaceCard.DEUCE, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.THREE, Suites.DIAMONDS);
        myDeckSuites[3] = new Card(FaceCard.FOUR, Suites.DIAMONDS);
        myDeckSuites[4] = new Card(FaceCard.FIVE, Suites.CLUBS);
        assertTrue(deckOfCard.isAStraight(myDeckSuites));
    }

    @Test
    public void testHandDoesNotHaveAStraightPairs() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.TEN,Suites.HEART);
        myDeckSuites[1] = new Card(FaceCard.NINE, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.EIGHT, Suites.DIAMONDS);
        myDeckSuites[3] = new Card(FaceCard.SEVEN, Suites.DIAMONDS);
        myDeckSuites[4] = new Card(FaceCard.SIX, Suites.CLUBS);
        assertTrue(deckOfCard.isAStraight(myDeckSuites));
    }
    @Test
    public void testHandHasAFullHouse() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.QUEEN, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.JACK, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.JACK, Suites.SPADES);
        assertTrue(deckOfCard.isAFullHouse(myDeckSuites));
    }
    @Test
    public void testHandDoestNotHaveAFullHouse() {
        DeckOfCard deckOfCard = new DeckOfCard();
        Card[] myDeckSuites = new Card[5];
        myDeckSuites[0] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[1] = new Card(FaceCard.QUEEN, Suites.SPADES);
        myDeckSuites[2] = new Card(FaceCard.QUEEN, Suites.CLUBS);
        myDeckSuites[3] = new Card(FaceCard.EIGHT, Suites.SPADES);
        myDeckSuites[4] = new Card(FaceCard.JACK, Suites.SPADES);
        assertFalse(deckOfCard.isAFullHouse(myDeckSuites));
    }
}





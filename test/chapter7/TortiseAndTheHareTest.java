package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TortiseAndTheHareTest {
    @Test
    public void checkCurrentPositionOfTheTortise(){
        TortiseAndTheHare game = new TortiseAndTheHare();
        assertEquals(1,game.getTortisePosition());
    }
    @Test
    public void checkCurrentMoveOfTheTortise(){
        TortiseAndTheHare game = new TortiseAndTheHare();
        game.tortiseMove(3);
        assertEquals(4,game.getTortisePosition());
    }
    @Test
    public void checkAnotherMoveOfTheTortise(){
        TortiseAndTheHare game = new TortiseAndTheHare();
        game.tortiseMove(3);
        assertEquals(4,game.getTortisePosition());
        game.tortiseMove(7);
        assertEquals(1,game.getTortisePosition());
    }
    @Test
    public void checkMoveOfTheHare(){
        TortiseAndTheHare game = new TortiseAndTheHare();
        game.hareMove(2);
        assertEquals(10,game.getHarePosition());

    }
    @Test
    public void checkAnotheMoveOfTheHare(){
        TortiseAndTheHare game = new TortiseAndTheHare();
        game.hareMove(2);
        assertEquals(10,game.getHarePosition());
        game.hareMove(10);
        assertEquals(10,game.getHarePosition());

    }
    @Test
    public void checkIfTheHareWon(){
        TortiseAndTheHare game = new TortiseAndTheHare();
        game.hareMove(2);
        assertEquals(10,game.getHarePosition());
        game.hareMove(10);
        assertEquals(10,game.getHarePosition());

    }



}
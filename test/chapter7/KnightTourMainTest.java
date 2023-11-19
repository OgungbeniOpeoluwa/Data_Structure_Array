package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTourMainTest {
    KnightTourMain knightTour;
    @BeforeEach
            public void setKnightTour() {
         knightTour = new KnightTourMain(8);
    }
    @Test
    public void testCurrentPositionOfKnightOnBoard(){
        int [] array = {3,4};
        assertArrayEquals(array,knightTour.getPosition());
    }
    @Test
    public void testPositionMoved(){
        int movement = 0;
        knightTour.moveKnight(movement);
        int [] array = {2,6};
        assertArrayEquals(array,knightTour.getPosition());


    }
    @Test
    public void testAnotherMovedPosition(){
        int movement = 6;
        knightTour.moveKnight(movement);
        int [] array = {5,5};
        assertArrayEquals(array,knightTour.getPosition());
        knightTour.moveKnight(3);
        int [] move = {4,3};
        assertArrayEquals(move,knightTour.getPosition());


    }
    @Test
    public void testThatTheKnightHasbeInitializedToOne() {
        assertEquals(1, knightTour.getBoardMove());
    }

    @Test
    public void testThatTheKnightHasVisitedTheSquare(){
        int movement = 3;
        knightTour.moveKnight(movement);
        knightTour.setBoardMove(movement);
        int array = 2;
        assertEquals(array,knightTour.getBoardMove());
        int move = 0;
        knightTour.moveKnight(move);
        knightTour.setBoardMove(movement);
        int result = 3;
        assertEquals(result,knightTour.getBoardMove());

    }
    @Test
    public void testThatTheKnightHasVisitedTheSameSquare() {
        int movement = 3;
        knightTour.moveKnight(movement);
        knightTour.setBoardMove(movement);
        int array = 2;
        assertEquals(array, knightTour.getBoardMove());
        int move = 7;
        knightTour.moveKnight(move);
        Throwable exception = assertThrows(IllegalArgumentException.class,()-> {
            knightTour.setBoardMove(move);
        });
        int [] result = {2,2};
        assertEquals("Space not available",exception.getMessage());
        assertArrayEquals(result,knightTour.getPosition());

    }

    @Test
    public void testThatTheKnightDoesNotLandOffTheBoard() {
        int movement = 0;
        knightTour.moveKnight(movement);
        knightTour.setBoardMove(movement);
        int array = 2;
        assertEquals(array, knightTour.getBoardMove());
        int move =0;
        knightTour.moveKnight(move);
        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            knightTour.setBoardMove(move);
        });
        assertEquals("space not found",exception.getMessage());
        int moves =0;
        knightTour.moveKnight(move);
        Throwable outOfbound = assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            knightTour.setBoardMove(moves);
        });
        int [] result = {2,6};
        assertEquals("space not found",outOfbound.getMessage());
        assertArrayEquals(result,knightTour.getPosition());
    }


}
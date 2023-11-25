package chapter7;

import chapter7.turtle.Directions;
import chapter7.turtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    @BeforeEach
    public void setUp(){
       turtle = new Turtle();
    }
    @Test
    public void getTurtleCurrentPosition(){
        Directions directions = Directions.NORTH;
        assertSame(directions,turtle.getDirections());
    }
    @Test
    public void testThatTurtleTurnsRight(){
        turtle.turnRight();
        turtle.turnRight();
        Directions directions = Directions.SOUTH;
        assertSame(directions,turtle.getDirections());

    }
    @Test
    public void testThatTurtleTurnRightTwiceThenTurnsLeft(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnLeft();
        Directions directions = Directions.EAST;
        assertSame(directions,turtle.getDirections());

    }
    @Test
    public void testThatTurtleTurnRightAndCurrentPositionChange(){
        turtle.move(2);
        turtle.turnRight();
        turtle.move(2);
        turtle.turnRight();
        turtle.move(2);
        int [] expected = {2,0};
        assertArrayEquals(expected,turtle.result());
    }


}
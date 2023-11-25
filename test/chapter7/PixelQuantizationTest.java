package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixelQuantizationTest {
    @Test
    public void testThatValuesAsBeQuatize(){
        int []number ={1,10,80,200,50};
        int [] expected = {10,10,70,190,50};
        assertArrayEquals(expected,PixelQuantization.pixelQuantizationFunction(number));
    }

}
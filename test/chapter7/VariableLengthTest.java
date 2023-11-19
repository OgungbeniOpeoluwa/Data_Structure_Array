package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthTest {
    @Test
    public void testFirstCall(){
        double result = VariableLength.printAverage(1,2,3,4,5);
        assertEquals(3,result);
    }
    @Test
    public void testSecondCall(){
        double result = VariableLength.printAverage(1,2,3,4);
        assertEquals(2,result);
    }
    @Test
    public void testThirdCall() {
        double result = VariableLength.printAverage(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(5.0, result);
    }



}
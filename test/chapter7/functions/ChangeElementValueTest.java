package chapter7.functions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChangeElementValueTest {
    int [] arrays = new int [20];
    @BeforeEach
    public  void setArrays(){
        for(int count = 0; count < arrays.length;count++){
            arrays[count] = count+1;
        }
    }

    @Test
    public void testThatElementAtIndex10_20ToZero(){
        int [] expected = arrays;
        for(int count = 9; count < 20;count++){
            arrays[count] = 0;
        }
       assertArrayEquals(expected,ChangeElementValue.setElementAtindexToZero(arrays));
    }
    @Test
    public void testThatMultiplyEachOfTheElement(){
        for(int count = 9; count < 20;count++){
            arrays[count] = 0;
        }
        int [] expected = arrays;
        for(int counts = 0; counts < arrays.length;counts++){
            arrays[counts] *= 2;
        }
        assertArrayEquals(expected,ChangeElementValue.multiplyEachOfTheElementBy2(arrays));
    }
    @Test
    public void testForTenBestValueScores(){
        for(int count = 9; count < 20;count++) {
            arrays[count] = 0;
        }
        for(int counts = 0; counts < arrays.length;counts++){
            arrays[counts] *= 2;
        }
        System.out.println(Arrays.toString(ChangeElementValue.bestValueScore(arrays)));
    }

}
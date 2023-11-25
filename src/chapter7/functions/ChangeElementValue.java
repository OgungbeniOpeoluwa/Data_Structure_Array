package chapter7.functions;

import java.util.Arrays;

public class ChangeElementValue {

    public static int[] setElementAtindexToZero(int[] arrays) {
        for(int count = 9; count < 20; count++){
            arrays[count] = 0;
        }
        return arrays;
    }

    public static int[] multiplyEachOfTheElementBy2(int[] arrays) {
        int [] result =setElementAtindexToZero(arrays);
        for(int count = 0; count < arrays.length; count++){
            result[count] *= 2;
        }
        return result;
    }

    public static int[] bestValueScore(int[] arrays) {
        arrays = multiplyEachOfTheElementBy2(arrays);
        int [] max = new int[10];
        int maximum = arrays[0];
        int counts = 10-1;
        for(int count = 1; count < arrays.length; count++){
            if(arrays[count] > maximum){
                maximum = arrays[count];
                max[counts] = maximum;
                counts--;
                arrays[count] = 0;
            }
        }
        System.out.println(Arrays.toString(max));
        return max;
    }
}

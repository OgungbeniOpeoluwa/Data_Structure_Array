package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static int[] duplicate(int[] number) {
        for(int count = 0;count < number.length;count ++){
            for(int counts = count +1;counts < number.length;counts++)
               if(number[count] == number[counts]){
                number[counts] = 0;

               }
        }
        return number;
    }
    public static int  lengths(int[] number){
        int counts = 0;
        for(int count = 0;count < number.length;count++){
                if(number[count] != 0) {
                    counts++;
                }

        }
        return counts;
    }

    public static int [] duplicates(int [] number){

        int result = lengths(number);
        int count = 0;
        int [] newResult = new int[result];
        for(int numbers = 0;numbers < number.length;numbers++){
            if(number[numbers] != 0){
                newResult[count] = number[numbers];
                count++;
            }

        }
        return newResult;
    }

}








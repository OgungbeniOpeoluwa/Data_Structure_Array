package chapter7;

import java.util.Arrays;

public class OneDimensional {
    public static void main(String[] args) {
        int [] array = new int [20];
        int [] total = new int[array.length];
        for(int number =0 ;number < array.length;number++){
            array[number] = number+1 ;
            if(number >= 10){
                array[number] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int numb : array){
            total[numb] = array[numb]*2;

        }
        System.out.println(Arrays.toString(total));
        for(int numb : total){
            if(numb > 0){
                System.out.println(numb);
            }
        }
    }
}

package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateMain {
    public static void main(String[] args) {
        int [] array = new int [10];
        Scanner scanner = new Scanner(System.in);
        for(int numbers = 0; numbers < array.length;numbers++){
            array[numbers] = -1;
        }

        for(int number = 0; number < array.length;number++){
            System.out.println("Enter a number between 10 and 100");
            int input = scanner.nextInt();
            while (input < 10 || input > 100){
                System.out.println("Kindly enter a valid number between 10 and 100;");
                input = scanner.nextInt();
            }
            array[number] = input;
        }
        System.out.println(Arrays.toString(array));
        int [] result =DuplicateElimination.duplicate(array);
        int [] result2 = DuplicateElimination.duplicates(result);
        System.out.println(Arrays.toString(DuplicateElimination.duplicates(result2)));
    }

    }

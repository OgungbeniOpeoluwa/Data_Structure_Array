package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of length you want: ");
        double length = scanner.nextInt();
        System.out.println(fibonnaciSeries(length));

    }


    public static int  fibonnaciSeries(int size ){
        int [] array = new int [size + 1];
        int firstNumber = 0;
        int secondNumb = 1;
        for(int number = 1; number <= size; number++){
            array[number] = firstNumber;
            int sum = firstNumber + secondNumb;
            firstNumber = secondNumb;
            secondNumb = sum;
        }
        return largestNumber(array);
    }

    public static double  fibonnaciSeries(double size ) {
        double[] array = new double[(int) size + 1];
        double firstNumber = 0;
        double secondNumb = 1;

        for (int number = 1; number <= size; number++) {
            array[number] = firstNumber;
            double sum = firstNumber + secondNumb;
            firstNumber = secondNumb;
            secondNumb = sum;
        }
        return largestNumber(array);
    }
    public static int largestNumber(int[]numbers){
        int maximum = numbers[0];
        for(int count = 1;count < numbers.length;count++){
            if(numbers[count] > maximum){
                maximum = numbers[count];
            }
        }
        return maximum;
    }
    public static double largestNumber(double[]numbers){
        double maximum = numbers[0];
        for(int count = 1;count < numbers.length;count++){
            if(numbers[count] > maximum){
                maximum = numbers[count];
            }
        }
        return maximum;
    }

    }

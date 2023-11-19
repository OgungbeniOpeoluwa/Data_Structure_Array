package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class AirplaneSeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        boolean[] seat = new boolean[10];
        int seatNo = 0;
        int count = 1;
        for (int number = 0; number < array.length; number++) {
            array[number] = count;
            count++;
        }
        int stoper = -1;
        int counter = 0;
        int counter2 = 5;

        while (stoper != 0) {
            System.out.println("Type 1 for First class and 2 for Economy: ");
            int input = scanner.nextInt();
            if (counter == 5 && input == 1) {
                System.out.println("The First class section is currently not available");
                System.out.println("is it acceptable to be placed in the economy section if yes press(2),else(0)");
                input = scanner.nextInt();
            }
            if (counter2 == 10 && input == 2) {
                System.out.println("The Economy class section is currently not available");
                System.out.println("is it acceptable to be placed in the First class section if yes press(1),else(0)");
                input = scanner.nextInt();
            }
            if (input == 0) {
                System.out.println("Next flight leaves in 3 hours.");
                break;
            }
            if (input == 1) {
                seatNo = array[counter];
                System.out.println("Your seat number is : " + seatNo + " first class");
                seat[counter] = true;
                counter++;
            } else {
                seatNo = array[counter2];
                System.out.println("Your seat number is : " + seatNo + " first class");
                seat[counter2] = true;
                counter2++;
            }
            System.out.println(Arrays.toString(seat));
            System.out.println("Will you like to continue if yes press(-1) else press(0): ");
            stoper = scanner.nextInt();


        }
    }


}

package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class ArcheryGame {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        int[][] arrays = new int[4][4];
        int total = 0;
        int numbers = 0;
        System.out.println( "players" + " score1" + " score2" + " Score3" + " total");
        int count = 0;
        int maximum = 0;
        int player = 0;
        int counts = 0;
        System.out.println("WELCOME TO ARCHERY GAME CENTER;IF YOU LIKE TO PLAY KINDLY PRESS (1),YOU CAN PRESS (0) TO STOP");
            int stopper = scanner.nextInt();
            while(stopper != 0) {
                for (int number = 0; number < arrays.length; number++){
                   count++;
                   System.out.printf("%s", "player" + count + "   ");
                   for (numbers = 0; numbers < arrays.length - 1; numbers++) {
                        arrays[number][numbers] = random.nextInt(0, 10);
                        System.out.print(arrays[number][numbers] + "   " + "   ");
                        total += arrays[number][numbers];
                   }
                   if (total > maximum) {
                        maximum = total;
                        player = count;
                   }
                   System.out.print(total);
                   total -= total;
                   System.out.println();
                }
                System.out.println("CONGRATULATION THE WINNER OF THIS SECTION IS PLAYER" + player + "  " + maximum);
                System.out.println("will you like to continue playing if yes enter (1),else enter (0)");
                stopper= scanner.nextInt();
            }
    }
        }



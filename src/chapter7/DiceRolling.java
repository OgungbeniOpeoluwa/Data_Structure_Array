package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int [] [] dice = new int [6] [6];
        SecureRandom random = new SecureRandom();
        int total = 0;
        for(int count  = 0; count < dice.length ; count++){
            for(int number = 0;number < dice.length ;number++) {
                int firstDie = 1 + random.nextInt(6);
                int secondDie = 1 + random.nextInt( 6);
                total = firstDie + secondDie;
                System.out.print(total + "  "  );
            }
            System.out.println();
        }


    }
}

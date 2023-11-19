package chapter7;

import java.util.Arrays;

public class SenvenOfErathosan {
    public static void main(String[] args) {
        int[] primeNumbers = new int[1000];
        boolean[] prime = new boolean[1000];
        for (int number = 0; number < prime.length; number++) {
            prime[number] = true;
            primeNumbers[number] = number;
        }


        for (int count = 2; count < primeNumbers.length; count++) {
            if (prime[count]) {
                for (int counts = count + 1; counts < primeNumbers.length; counts++) {
                    if (primeNumbers[counts] % primeNumbers[count] == 0) {
                        prime[counts] = false;
                        primeNumbers[counts] =0;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(prime));
        System.out.println(Arrays.toString(primeNumbers));
    }
}

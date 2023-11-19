package chapter7;

import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] result = new int[5];
        int lgbtq = 0;
        int  mentalHealth = 0;
        int healthCareAccess = 0;
        int dataInsecurity = 0;
        int gunControl = 0;
        int counts = 0;
        String[] socialIssues = {"LGBTQ RIGHT", "MENTAL HEALTH", "HEALTHCARE", "DATA INSECURITY", "GUN CONTROL"};
        int[][] response = new int[5][10];
        System.out.println("Kindly enter your rate on this issues where 1 is the least and 10 is the most important");
        int stoper = 1;
        while (stoper != 0) {
            for (int number = 0; number < socialIssues.length; number++) {
                System.out.println(socialIssues[number]);
                int userInput = scanner.nextInt();

                switch(number){
                    case 0 -> {
                        lgbtq += userInput;
                        result[number] = lgbtq;
                    }
                    case 1 ->{
                            mentalHealth += userInput;
                        result[number] = mentalHealth;
                    }
                    case 2 -> {
                        healthCareAccess += userInput;
                        result[number] = healthCareAccess;
                    }
                    case 3 -> {
                        dataInsecurity += userInput;
                        result[number] = dataInsecurity;
                    }
                    case 4 -> {
                        gunControl += userInput;
                        result[number] = gunControl;

                    }
                }
                if (userInput == 1) {
                    counts = 0;
                } else {
                    counts = userInput - 1;
                }
                response[number][counts] += 1;
            }
            System.out.println("if you  will like to continue press(1) else press(0)  ");
            stoper = scanner.nextInt();
        }
        int inputss;
        int results = 0;
        String max = " ";
        String min = " ";
        int maximum = result[0];
        int mininimum = result[0];
        System.out.println("SOCIAL ISSUES" + "  1\t" + " 2\t"
                          + " 3\t" + " 4\t " + " 5\t " + " 6\t" + " 7\t" + " 8\t" + " 9\t " + "10\t" + " Average");
        for (int counter = 0; counter < socialIssues.length; counter++) {
            System.out.print(socialIssues[counter] + "   ");
            for (int numb = 0; numb < 10; numb++) {
                inputss = response[counter][numb];
                if(inputss > 0) {
                    results +=inputss;
                }
              System.out.print(" " + inputss + "\t");
            }
            System.out.print(result[counter]/results);
            if(result[counter] > maximum){
                maximum = result[counter];
                max = socialIssues[counter];
            }
            else if(result[counter] < mininimum){
                mininimum = result[counter];
                min = socialIssues[counter];
            }
            results -= results;
            System.out.println(" ");
             }
        System.out.println("The highest social issue is  " + max + " with the total points of: " + maximum);
        System.out.println("The lowest social issue  is  " + min + "  with the total points of : " + mininimum);


        }

    }

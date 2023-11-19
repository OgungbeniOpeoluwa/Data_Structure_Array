package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class EnhancedGradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int input = scanner.nextInt();
        System.out.println("Enter number of Exams for the gradeBooK: ");
        int exam = scanner.nextInt();
        int [] [] result = gradeBook(input,exam);
        System.out.println(Arrays.deepToString(result));
    }





    public static int [][] gradeBook(int numberOfStudent,int numberOfExam){
        Scanner scanner = new Scanner(System.in);
        int [][] array = new int [numberOfStudent][numberOfExam];
        for(int number = 0; number < numberOfStudent;number++) {
            for (int count = 0; count < numberOfExam; count++) {
                System.out.println("Enter student " + (number +1) + " " + "score" + (count + 1));
                int input = scanner.nextInt();
                array[number][count] = input;
            }
        }
        return array;
    }





}

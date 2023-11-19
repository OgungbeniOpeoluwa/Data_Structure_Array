package chapter7;

public class VariableLength {

    public static void main(String[] args) {
        int [] arrays ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(printAverage(arrays));


    }


    public static double printAverage(int...numbers){
        int result = 0;
        for(int number = 0;number < numbers.length;number ++ ){
           result += numbers[number];
        }
        return (double) result / numbers.length;

    }
}

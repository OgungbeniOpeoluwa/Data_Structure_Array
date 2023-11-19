package chapter7;

import java.util.Arrays;

public class EnhancedStatement {
    public static void main(String[] args) {
        for (String s:args){
            int result1 =Integer.parseInt(s);
            if(result1> 0){
                System.out.println(result1);


            }

        }

    }
}

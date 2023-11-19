package chapter7;

public class CommandArguement {
    public static void main(String[] args) {
        int minimum = Integer.parseInt(args[0]);
        int maximum = Integer.parseInt(args[0]);
        for(int count = 0;count < args.length;count ++){
            int result = Integer.parseInt(args[count]);
            if(result < minimum ){
                minimum = result;
            }
            if(result > maximum){
                maximum = result;
            }

        }
        double total = (double)(maximum + minimum) / 2;
        System.out.println("the average of the maximum and minimum is : " + total);
    }
}

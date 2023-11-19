 package chapter7;

 import java.util.InputMismatchException;
 import java.util.Scanner;

 public class KnightTourMain {
     public void displayBoard(){
         KnightTourMain knightTour = new KnightTourMain(8);
         loop();
             for (int counts = 2; counts <= 64; counts++) {
                 boolean result;
                 do{
                     try{
                         System.out.println("Enter a number between 0 and 7 : ");
                         int input = collectInput();
                         knightTour.moveKnight(input);
                         knightTour.setBoardMove(input);
                         loop();
                         result = false;
                     }
                     catch(IllegalArgumentException wrongMove){
                         System.out.println(wrongMove.getMessage());
                         System.out.println("SPACE NOT AVAILABLE ON BOARD");
                         result = true;
                     }
                     catch (ArrayIndexOutOfBoundsException outOfBounds){
                         System.out.println(outOfBounds.getMessage());
                         System.out.println("WRONG MOVE");
                         result = true;
                     }
                     catch (InputMismatchException wrongInput){
                         System.out.println(wrongInput.getMessage());
                         System.out.println("INVALID INPUT");
                         result = true;

                     }
                 }while (result);

             }
         }



    private int currentColumn = 4;

    private int currentRow = 3;
    private static int [] [] square;
    int move = 1;

    public  int[] getPosition() {
        return new int[]{currentRow,currentColumn};
    }

    public KnightTourMain(int number){
        square = new int[number][number];
        square[currentRow][currentColumn] = move;
    }

    public void setBoardMove(int movement){
        if(currentRow >= 0 && currentRow < square.length && currentColumn >= 0 && currentColumn < square.length){
            checkBoardFill(movement);
        }
        else{
            setBackKnightMoveWhenFilled(movement);
            throw new ArrayIndexOutOfBoundsException("space not found");
        }


    }
    public  void checkBoardFill(int movement){
        if (square[currentRow][currentColumn] == 0) {
            square[currentRow][currentColumn] = ++move;
        }
        else{
            setBackKnightMoveWhenFilled(movement);
            throw new IllegalArgumentException("Space not available");
        }
    }


    public int getBoardMove(){
        return move;
    }
    public void moveKnight(int movement) {
            currentRow += verticalMoves(movement);
            currentColumn += horizontalMoves(movement);

    }
    public void setBackKnightMoveWhenFilled(int movement){
        currentRow -= verticalMoves(movement);
        currentColumn -= horizontalMoves(movement);
    }

    public static int horizontalMoves(int input) {
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        return horizontal[input];
    }

    public static int verticalMoves(int input) {
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
        return vertical[input];
    }

     public static void loop() {
         for (int count = 0; count < square.length; count++) {
             for (int numb = 0; numb < square[count].length; numb++) {
                 System.out.print(square[count][numb] + "  ");
             }
             System.out.println();
         }
     }
     public static int collectInput() {
         Scanner scanner = new Scanner(System.in);
         return scanner.nextInt();
     }

}
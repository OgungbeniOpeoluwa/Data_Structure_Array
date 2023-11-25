package chapter7.turtle;

import java.util.Scanner;

public class Turtle {
    private int row = 0;
    private int column = 0;
    int move = 1;

    private Pen pen = Pen.UP;
    static int [] [] board = new int[20][20];

    private Directions directions = Directions.EAST;

    public  Directions getDirections(){
        return directions;
    }

    public void setBoard(){
        board[row][column] = move;
    }
    public int [] [] getBoard(){
        return board;
    }

    public int[] result (){
        return  new int[]{row,column};
    }

    public void turnRight(){
        if (this.directions == Directions.NORTH){
            this.directions = Directions.EAST;
        }
        else if (this.directions == Directions.EAST){
            this.directions = Directions.SOUTH;
        }
        else if (this.directions == Directions.SOUTH){
            this.directions = Directions.WEST;
        }
        else{
            this.directions = Directions.NORTH;
        }

    }
    public void turnLeft(){
        if (this.directions == Directions.NORTH){
            this.directions = Directions.WEST;
        }
        else if (this.directions == Directions.WEST){
            this.directions = Directions.SOUTH;
        }
        else if (this.directions == Directions.SOUTH){
            this.directions = Directions.EAST;
        }
        else{
            this.directions = Directions.NORTH;
        }

    }
    public void move(int number){
        if(getDirections() == Directions.NORTH){
            this.column += number;
        } else if (getDirections() == Directions.EAST) {
            this.row += number;
        } else if (getDirections() == Directions.SOUTH) {
            this.column -= number;
        }
        else{
           this.row -= number;
        }

    }
    public void listOfInstruction(int number){
       switch (number){
           case 1 :{
               pen = Pen.UP;
           }
           case 2 : {
               pen = Pen.DOWN;
           }
           case 3: {
               turnRight();
               break;
           }
           case 4 : {
               turnLeft();
           }
           case 5 : {
               if (validatePen()) {
                   Scanner scanner = new Scanner(System.in);
                   System.out.println("Enter number of Steps");
                   int input = scanner.nextInt();
                   move(input);
                   setBoard();
           }
               break;
           }
           case 6:{
               displayBoard();
           }
           case 9: {
               break;
           }

       }

    }
    private boolean validatePen(){
        if(this.pen == Pen.DOWN){
            return true;
        }
        else return false;

    }

    private void displayBoard() {
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j<board.length;j++){
                if(getBoard()[i][j] == 0){
                    System.out.print("  ");
                    continue;
                }
                System.out.print(getBoard()[i][j] + " ");

            }
            System.out.println();
        }
    }


}

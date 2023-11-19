package chapter7;

public class Tortise{
    private int tortisePosition;

    public void tortiseMove(int number){
        if(number >=1 && number <= 5)tortisePosition += 3;
        if(number  >= 6 && number <=7) tortisePosition -= 6;
        if(number >= 8 && number <= 10) tortisePosition += 1;
    }
    public int getTortisePosition() {
        if(tortisePosition < 1){
            tortisePosition = 1;
        }
        return tortisePosition;
    }
}

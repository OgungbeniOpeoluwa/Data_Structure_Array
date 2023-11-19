package chapter7;

import java.util.Arrays;

public class TortiseAndTheHareMain {

    public static void main(String[] args) {
        TortiseAndTheHare game = new TortiseAndTheHare();

        for(int count = 1; count <= 70; count++) {
            game.tortiseMove(game.play());
            game.hareMove(game.play());
            game.setTortiseLine(game.getHarePosition(),game.getTortisePosition());
        }
        System.out.println(Arrays.toString(game.getPositionLine()));
    }
}

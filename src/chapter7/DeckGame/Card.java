package chapter7.DeckGame;

public class Card {
    private FaceCard face;
    private Suites suite;
    public Card(FaceCard face, Suites suite){
        this.face = face;
        this.suite = suite;
    }
    public String toString(){
        return face + " of " + suite;
    }
    public FaceCard getFace(){
        return face;
    }
    public Suites getSuites(){
        return suite;
    }
}

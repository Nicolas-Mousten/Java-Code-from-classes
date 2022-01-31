package Examtest2;

public class Test {
    public static void main(String[] args) {
        Card card1 = new Card("spar", 7);
        Card card2 = new Card("spar", 7);
        Card.beats(card1,card2);
    }
}

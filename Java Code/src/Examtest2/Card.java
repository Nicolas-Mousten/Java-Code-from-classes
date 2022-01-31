package Examtest2;

public class Card {
    private String suit;
    private int value;
    private int suitID;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        if(this.suit.equals("hjærter")){
            this.suitID = 1;
        }
        if(this.suit.equals("ruder")){
            this.suitID = 2;
        }
        if(this.suit.equals("spar")){
            this.suitID = 3;
        }
        if(this.suit.equals("klør")){
            this.suitID = 4;
        }
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public static void beats(Card card1, Card card2){
        System.out.println("The 2 cards fighting is: " +card1.getSuit()+" "+card1.getValue()+" and: "+card2.getSuit()+" "+card2.getValue());
        boolean card1BiggerCard2 = false;
        if(card1.suitID> card2.suitID || card1.getSuit().equalsIgnoreCase("hjærter")){
            card1BiggerCard2 = true;
        }
        if(card1.getValue() > card2.getValue() && card1BiggerCard2 == true){
            System.out.println(card1.getSuit()+ " " + card1.getValue() +" slår " +card2.getSuit() + " " + card2.getValue());
        }
        else if(card2.getValue() > card1.getValue() && card1BiggerCard2 == true){
            System.out.println(card2.getSuit()+ " " + card2.getValue() +" slår " +card1.getSuit() + " " + card1.getValue());
        }
        else if(card1.getValue() < card2.getValue() && card1BiggerCard2 == false){
            System.out.println(card2.getSuit()+ " " + card2.getValue() +" slår " +card1.getSuit() + " " + card1.getValue());
        }
        else if(card2.getValue() < card1.getValue() && card1BiggerCard2 == false){
            System.out.println(card1.getSuit()+ " " + card1.getValue() +" slår " +card2.getSuit() + " " + card2.getValue());
        }
        else{
            System.out.println("They are equal");
        }
    }
}

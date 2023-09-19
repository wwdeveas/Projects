//Name: Walter DeVeas
//File Name: Card.java
//Description: the file that has the card class in it
//Date: 03/03/2023

public class Card implements Comparable<Card> {

    private int rank;
    private int suit;
    //Ace = 1
    private final String[] rankNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private final String[] suitNames = {"Spades", "Clubs", "Hearts", "Diamonds"};
    
    public Card() {
        this.rank = 0;
        this.suit = 0;
    }
    public void setCard(int s, int r) {
        this.suit = s;
        this.rank = r;
    }
    public void drawCard() {
        this.rank = (int)(Math.random() * ((13 - 1) + 1));
        this.suit = 1+(int)(Math.random() * ((4 - 1)));
        //System.out.println("TEST: " + this.suit);
    }
    public int getRank() {
        return this.rank;
    }
    public int getSuit() {
        return this.suit;
    }
    @Override
    public String toString() {
        return "" + this.rankNames[rank] + " of " + this.suitNames[suit];
    }
    //@Override
    public boolean equals(Card that) {
        if (this == that)
            return true;    // object is compared with itself
        if (!(that instanceof Card))
            return false;   // objects are not the same type
        if (((Card) that).getRank() == getRank())
            return true;    // actual data test
        return false;
    }
    @Override
    public int compareTo(Card that) {
        return Integer.compare(getRank(), that.getRank());
    }
    
}
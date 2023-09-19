//file name: DeckOfCard.java
//name:Walter DeVeas
//date:05/08/2023
//description: class that alters the deck by filling shuffling it, or drawing the cards to the players hand
public class DeckOfCards {

    private LinkedStack<Card> myDeck;
    private LinkedStack<Card> discardPile;
    private int numCards;

    public DeckOfCards() {
        myDeck = new LinkedStack<>();
        discardPile = new LinkedStack<>();
        numCards = 52;
    }
    public void fillDeck() {
        if (!myDeck.isEmpty()) {
            throw new RuntimeException("Deck is not empty!");
        }
        //fills deck in default order
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <13; j++) {
                Card tempCard = new Card();
                tempCard.setCard(i, j);
                myDeck.push(tempCard);
            }
        }
    }
    public void shuffleDeck() {
        System.out.println("Shuffling...");
        if (myDeck.isEmpty()) {
            throw new RuntimeException("Deck is empty!");
        } 
        //swaps all of the cards
        for (int i = 0; i < numCards; i++) {
            int randIndex = (int)(Math.random() * numCards);
            myDeck.swap(i, randIndex);
        }
    }
    public void drawCards(int numCardsToDraw) {
        if (numCardsToDraw > numCards) {
            throw new RuntimeException("Not enough cards in deck!");
        }
        //sets the card objects to an array of the users choosing
        Card[] myHand = new Card[numCardsToDraw];
        for (int i = 0; i < numCardsToDraw; i++) {
            myHand[i] = myDeck.pop();
            numCards--;
        }
        //takes the cards from the array
        for (Card card : myHand) {
            discardPile.push(card);
        }
    }
    public String discard() {
            StringBuilder sb = new StringBuilder();
            sb.append("Cards in hand: [");
            sb.append(discardPile);
            sb.append("]");
            return sb.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LinkedStack<Card> temp = new LinkedStack<>();
        sb.append("Deck of Cards:");
        while (!myDeck.isEmpty()) {
                Card card = myDeck.pop();
                sb.append("\n").append(card.toString());
                temp.push(card);
        }
        while (!temp.isEmpty()) {
            myDeck.push(temp.pop());
        }
        return sb.toString();
    }
}
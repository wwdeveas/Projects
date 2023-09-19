//file name: PlayAGame.java
//name:Walter DeVeas
//date:05/08/2023
//description: class with main()




import java.util.Scanner;

public class PlayAGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new deck of cards
        DeckOfCards myDeck = new DeckOfCards();
        System.out.println("Unshuffled Deck: ");
        myDeck.fillDeck();
        System.out.println(myDeck.toString());

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Shuffled Deck: ");
        myDeck.shuffleDeck();
        System.out.println(myDeck.toString());
        System.out.println();
        System.out.println();
        System.out.println();

        // Ask the user how many cards they want to draw
        System.out.println("Shall we play a game?");
        System.out.print("How many cards do you want to draw? ");
        int numCards = scanner.nextInt();

        // Draw the specified number of cards into a hand
        myDeck.drawCards(numCards);
        System.out.println(myDeck.discard());

        System.out.println();
        System.out.println();

        System.out.println("New set of cards without the ones in your hand: ");
        myDeck.shuffleDeck();
        System.out.println(myDeck.toString());
    }
}

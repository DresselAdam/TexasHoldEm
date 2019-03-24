
public class Main {

	public static void main(String[] args) {
		// Deck is a card array that is used to hold different all the cards of a standard deck.
        Card[] deck = new Card[52];

        // String arrays for suits and faces, using standard card values
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] faces =  {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // deckPos used to iterate through the deck array in, each position should hold a unique card
        int deckPos = 0;

        //For loop generates cards by iterating through suits and faces arrays. A new card is assigned to a position
        // in the deck that iterates with each new element in the faces array.
        for(String suit : suits){
            for(String face : faces){
                deck[deckPos] = new Card(face, suit);
                System.out.println(face + " of " + suit);
                deckPos++;
            }
        }

	}

}

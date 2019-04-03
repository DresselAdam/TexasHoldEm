// Adam Dressel
// 														

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Deck is a card array that is used to hold different all the cards of a standard deck.
        Card[] deck = new Card[52];
        Random deckDraw = new Random();
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
		                deckPos++;
		            }
		        }
        // Player is generated after the deck, so that the deck[] array can be accessed. 
        Player player1 = new Player();
        
        // Draw variable used to draw from the deck at a random index. Used in the loop to give a random card to player 1
        // The hand[] array for player 1 is used and looped through. Each card is assigned a random card in the deck
        for(int i = 0; i < 2; i++) {
        	int draw = deckDraw.nextInt(52);
        	if(i == 0) {
        		player1.setFirstCard(deck[draw]);
        	}
        	else {
        		player1.setSecondCard(deck[draw]);
        	}
        	
        }
        // Card Ids for each of the cards in PlayerHand. Assigned to these variables for conciseness.
        String p1FirstCard = player1.getCard(0).getId(); 
        String p1SecondCard = player1.getCard(1).getId();
        
        // Initialization of the gameBoard, currently assigned specified cards in deck. **CHANGE SOON**
        Board gameBoard = new Board();
        
        // addCards iterated up to 3, initial turn for Texas Holdem has 3 cards on the board.
        for(int addCards = 0; addCards < 3; addCards++) {
        	int draw = deckDraw.nextInt(52);
        	gameBoard.addBoardCard(deck[draw]);
        }
        // Text for the board and it's cards.
        System.out.println("Board:");
        String[] boardCards = new String[3];
        for(int j = 0; j < 3; j++) {
        	boardCards[j] = gameBoard.getCard(j).getId();
        	System.out.printf("%s | ",boardCards[j]);
        }
        
        // Text for player1 and their cards.
        System.out.printf("\nPlayer:");
        
        System.out.printf("\n%s | ", p1FirstCard);
        System.out.printf(" %s", p1SecondCard);
	
		
	}
}

// Adam Dressel
// 														**** REMINDER *****
// 															Edit Loops!

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
        for(int i = 0; i < 2; i++) {
        	int draw = deckDraw.nextInt(52);
        	if(i == 0) {
        		player1.setFirstCard(deck[draw]);
        	}
        	else {
        		player1.setSecondCard(deck[draw]);
        	}
        	
        }
        
        Board gameBoard = new Board(deck[0],deck[1],deck[2]);
        System.out.println("Board:");
        for(int j = 0; j < 3; j++) {
        	System.out.printf("%s | ",gameBoard.getCardInBoard(j).getId());
        }
        System.out.printf("\nPlayer:");
        
        System.out.printf("\n%s | ", player1.getSecondCard().getId());
        System.out.printf(" %s", player1.getFirstCard().getId());
	
	
		for(int loopHand = 0; loopHand < player1.getHand().length; loopHand++) {
			for(int loopBoard = 0; loopBoard < gameBoard.getBoard().size(); loopBoard++) {
				if(player1.getFirstCard().getId().equals(gameBoard.getCardInBoard(loopBoard).getId())) {
					System.out.printf("\nPair!");
				}
				else {
					continue;
				}
			}
		}
	}
}

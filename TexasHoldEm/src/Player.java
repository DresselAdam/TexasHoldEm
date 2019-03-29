
public class Player {
	private Card[] hand = new Card[2];

	// Empty constructor
	public Player() {
		
	}
	
	// Constructor with two cards as parameters. Each card is assigned to the hand[] array at a corresponding index.
	public Player(Card firstCard, Card secondCard) {
		hand[0] = firstCard;
		hand[1] = secondCard;
	}

	public Card getFirstCard() {
		return hand[0];
	}

	public Card getSecondCard() {
		return hand[1];
	}
}

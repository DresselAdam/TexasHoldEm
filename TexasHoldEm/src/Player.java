
public class Player {
	private Card[] pocket = new Card[2];
	private static int playerCount;

	// Empty constructor
	public Player() {
		playerCount++;
	}
	
	// Constructor with two cards as parameters. Each card is assigned to the hand[] array at a corresponding index.
	public Player(Card firstCard, Card secondCard) {
		pocket[0] = firstCard;
		pocket[1] = secondCard;
	}

	public  Card[] getPocket() {
		return pocket;
	}
	
	public Card getFirstCard() {
		return pocket[0];
	}

	public Card getSecondCard() {
		return pocket[1];
	}
	
	public void setFirstCard(Card firstCard) {
		pocket[0] = firstCard;	
	}
	
	public void setSecondCard(Card secondCard) {
		pocket[1] = secondCard;	
	}
}


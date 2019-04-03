import java.util.ArrayList;

public class Board{
	private ArrayList<Card> board = new ArrayList<>();
	
	public Board() {
		
	}
	
	// Board constructor with three card arguments, which is the initial size of a board in TexasHoldem
	public Board(Card firstCard, Card secondCard, Card thirdCard) {
		board.add(firstCard);
		board.add(secondCard);
		board.add(thirdCard);
	}
	
	public void setFirstCard(Card firstCard) {
		board.add(firstCard);
	}
	
	public void setSecondCard(Card secondCard) {
		board.add(secondCard);
	}

	public void setThirdCard(Card thirdCard) {
		board.add(thirdCard);
	}
	//Gets the entire board ArrayList, useful for getting size of the board and other values.
	public ArrayList<Card> getBoard(){
		return board;
	}
	
	// Getting a card at the specified position in the board ArrayList. Useful for card comparisons.
	public Card getCard(int boardPos) {
		return board.get(boardPos);
	}
	
	// Adding additional cards to the board, will be used for "turn" and "river".
	public void addBoardCard(Card nextCard) {
		board.add(nextCard);
	}
}

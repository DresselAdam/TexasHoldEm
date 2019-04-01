import java.util.ArrayList;

public class Board {
	ArrayList<Card> board = new ArrayList<>();
	
	public Board() {
		
	}
	
	// Board constructor with three card arguments, which is the initial size of a board in TexasHoldem
	public Board(Card firstCard, Card secondCard, Card thirdCard) {
		board.add(firstCard);
		board.add(secondCard);
		board.add(thirdCard);
	}
	
	public ArrayList<Card> getBoard(){
		return board;
	}
	
	public Card getCardInBoard(int boardPos) {
		return board.get(boardPos);
	}
}

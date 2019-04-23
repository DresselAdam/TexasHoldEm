
// Adam Dressel
import java.util.ArrayList;

public class Board {
  private ArrayList<Card> board = new ArrayList<>();
  private static int cardCount;

  public Board() {

  }

  
  /**Board constructor with three card arguments, 
   * which is the initial size of a board in TexasHoldem.
   * @param firstCard First Card on the board
   * @param secondCard Second card on the board
   * @param thirdCard Third card on the board.
   */
  public Board(Card firstCard, Card secondCard, Card thirdCard) {
    board.add(firstCard);
    board.add(secondCard);
    board.add(thirdCard);
  }

  // Gets the entire board ArrayList, useful for getting size of the board and
  // other values.
  public ArrayList<Card> getBoard() {
    return board;
  }

  public static void setCardCount() {
    cardCount++;
  }

  // Getting a card at the specified position in the board ArrayList. Useful for
  // card comparisons.
  public Card getCard(int boardPos) {
    return board.get(boardPos);
  }

  // Adding additional cards to the board, will be used for "turn" and "river".
  // Each time a card is added
  public void addCard(Card nextCard) {
    board.add(nextCard);
    Board.setCardCount();
  }

  // Counts the number of cards that have been played so far in the game. This
  // method is used to
  // iterate through
  // the shuffleDeck array numbers, no repeating cards.
  public static int getCount() {
    return cardCount;
  }
}

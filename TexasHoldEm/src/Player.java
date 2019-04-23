// Adam Dressel
public class Player extends Board {
  private static int playerCount;

  // Empty constructor
  public Player() {
    Player.setPlayerCount();
  }

  public static void setPlayerCount() {
    playerCount++;
  }

  // Creates addCard method that calls the same method for the board class.
  public void addCard(Card card) {
    super.addCard(card);
  }

  public static int getPlayerCount() {
    return playerCount;
  }
}


// Adam Dressel
// This project is the framework for a Texas Hold'em game.
// A deck of cards is generated and assigned to boards and players
// Currently no user interaction or "game" mechanics have been implemented.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

  /**The main method is the driving class of the Texas hold'em program.
   @param args Classic main syntax. 
   */
  public static void main(String[] args) {
    // Scanner asks for the number of players in the current game.
    // Exception handling is done to make sure the user enters an integer.
    System.out.println("Welcome to Texas Hold'em!");
    Scanner scan = new Scanner(System.in, "utf-8");
    System.out.println("Please enter the number of players.");
    int numPlayers = 0;
    // Input is contained in a do while loop and only exits when the next input is
    // an integer.
    do {
      try {
        numPlayers = scan.nextInt();
        break;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a number");
        scan.next();
      }
    } while (scan.hasNextLine());
    // Deck is a card array that is used to hold different all the cards of a
    // standard deck.
    Card[] deck = new Card[52];

    // deckDraw is used to create an array of random integers. These integers are
    // used to draw from
    // the deck
    // at random intervals.
    Random deckDraw = new Random();
    // 2D string array for suits and faces, using standard card values.
    String[][] cardId = {{"Clubs", "Spades", "Diamonds", "Hearts"},
        {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}};

    // deckPos used to iterate through the deck array in, each position should hold
    // a unique card
    int deckPos = 0;

    // The following subroutine generates the deck of cards using the cardId 2d
    // array. A nested for
    // loop is used
    // and a new card is created for each unique suit and face "pair."
    for (int suit = 0; suit < 4; suit++) {
      for (int face = 0; face < 13; face++) {
        // First value of array is assigned zero, since that is the suit array, second
        // value is
        // assigned 1
        // since it is the second array in cardID[][].
        deck[deckPos] = new Card(cardId[0][suit], cardId[1][face]);
        deckPos++;
      }
    }
    // The arrayList deckShuffle holds random distinct integers.
    // The if/else statement ensures that an integer is not repeated.
    ArrayList<Integer> deckShuffle = new ArrayList<>();
    for (int i = 0; i < 52; i++) {
      int drawNum = deckDraw.nextInt(52);
      if (deckShuffle.contains(drawNum)) {
        deckShuffle.add(deckDraw.nextInt(52));
      } else {
        deckShuffle.add(drawNum);
      }
    }

    // Initialization of the gameBoard, holds an ArrayList of cards.
    Board gameBoard = new Board();

    // addCards iterated up to 3, initial turn for Texas Holdem has 3 cards on the
    // board.
    // A card is added to the deck by accessing the deckShuffle integer arrayList.
    // The arrayList is access via the board's static method - getCount - which
    // gets a static value that is incremented every time the addCard method is
    // used.
    for (int addCards = 0; addCards < 3; addCards++) {
      gameBoard.addCard(deck[deckShuffle.get(Board.getCount())]);
    }

    // Text for the board and it's cards.
    System.out.println("Board:");
    // A string array is created to hold the Ids for the board cards.

    String[] boardCards = new String[3];
    for (int j = 0; j < 3; j++) {
      boardCards[j] = gameBoard.getCard(j).getId();
      System.out.printf("%s | ", boardCards[j]);
    }
    System.out.println("");
    // Player is generated after the deck, so that the deck[] array can be accessed.
    // The table array holds the amount of players in the game, chosen by user
    // input.
    // The players card are added in the same manner as the board cards, using the
    // deckShuffle arrayList.
    Player[] table = new Player[numPlayers];
    for (int plyrNum = 0; plyrNum < numPlayers; plyrNum++) {
      table[plyrNum] = new Player();
      for (int j = 0; j < 2; j++) {
        table[plyrNum].addCard(deck[deckShuffle.get(Board.getCount())]);
      }

      // Card Ids for each of the cards in each players pocket.
      // Assigned to these variables for conciseness.

      String plyrCard1 = table[plyrNum].getCard(0).getId();
      String plyrCard2 = table[plyrNum].getCard(1).getId();

      // Text for player1 and their cards.
      System.out.printf("\nPlayer" + (plyrNum + 1) + ":");

      System.out.printf("%n%s | ", plyrCard1);
      System.out.printf(" %s", plyrCard2);

      System.out.println("");
    }
    scan.close();

    // The deckShuffle is an arrayList of integers. This loop adds every element of
    // the arrayList
    // together
    // and the sum is printed after the loop.
    // The loop is a for each loop.
    int sum = 0;
    for (int arraySum : deckShuffle) {
      sum += deckShuffle.get(arraySum);
    }
    System.out.println("The sum of deckShuffle is " + sum);

    // Integration requirements that did not fit with the theme are relegated to
    // their own class,
    // and the requirements are called via static methods.
    Integration.smallElement();
    Integration.findIndex();
    Integration.findCoordinates();
  }
}

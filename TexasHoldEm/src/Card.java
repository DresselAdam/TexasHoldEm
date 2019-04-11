// Adam Dressel
public class Card {
  private String face;
  private String suit;
  private String id;

  // empty constructor
  public Card() {

  }

  // Constructor that takes two strings - face and suit - as parameters.
  // The id is set the full name of the card, because thats what people use to refer to cards.
  public Card(String suit, String face) {
    this.face = face;
    this.suit = suit;
    id = face + " of " + suit;
  }

  public void setFace(String face) {
    this.face = face;
  }


  // Overriding the setFace method to be able to take an integer as a parameter.
  public void setFace(int face) {
    this.face = Integer.toString(face);
  }

  public String getFace() {
    return face;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public String getSuit() {
    return suit;
  }

  public String getId() {
    return id;
  }
}


public class Card {
	private String face;
    private String suit;
    private boolean isFaceUp;

    //empty constructor
    public Card(){

    }
    // Constructor that takes two strings - face and suit - as parameters.
    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    public void setFace(String face){
        this.face = face;
    }

    public String getFace(){
        return face;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public String getSuit(){
        return suit;
    }
}

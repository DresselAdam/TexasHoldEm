
public class Card {
	private String face;
    private String suit;
    private String id;
    private boolean isFaceUp;

    //empty constructor
    public Card(){

    }
    // Constructor that takes two strings - face and suit - as parameters.
    // The id is set the full name of the card, because thats what people use to refer to cards.
    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;
        id = face + " of " + suit;
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
    
    public String getId() {
    	return id;
    }
}

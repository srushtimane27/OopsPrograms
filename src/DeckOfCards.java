import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

public class DeckOfCards{
    private ArrayList<Card> deck;
    // 1.Define the class
    // 2.Define the instance variable
    // 3.Create Constructor - this will define the object in the system
    // 4.Create get/set methods
    // 5.Create any custom methods

    /**
     * This i a 1 argument constructor that passes in a collection of card object
     *
     * @param deck
     */
    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }
    /**
     * This is a zero argument constructor that will build a full Deck of Cards
     */
    public DeckOfCards(){
        List<String> suits = Card.getValidSuits(); //this is calling a static method
    }
    
}

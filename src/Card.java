
import javafx.scene.image.Image;
public class Card {
    private String faceName, Suit;

    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return Suit;
    }

    public void setSuit(String suit) {
        Suit = suit;
    }
}

/**
 * A Card from a standard deck of playing cards
 *
 * @author Jeff Manning <info@jeffmanning.ca>
 * @version 1.0.0
 */

public class Card
{
    public static final String SPADES   = "spades";
    public static final String HEARTS   = "hearts";
    public static final String DIAMONDS = "diamonds";
    public static final String CLUBS    = "clubs";
    
    private String value;
    private String suite;
    private boolean flipped;
    /**
     * Constructor for objects of class Card
     */
    public Card(String value, String suite)
    {
       this.value   = value;
       this.suite   = suite;
       this.flipped = false;
    }
    
    public Card(String value, String suite,boolean flipped)
    {
       this.value   = value;
       this.suite   = suite;
       this.flipped = flipped;
    }
    
    public boolean isFlipped() {
        return this.flipped;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public String getSuite() {
        return this.suite;
    }
    
    public boolean isCard(Card card) {
        if(
            this.value.equals(card.getValue()) &&
            this.suite.equals(card.getSuite())
        ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void flipFaceUp() {
        this.flipped = true;
    }
    
    public void flipFaceDown() {
        this.flipped = false;
    }
    
    public void flip() {
        this.flipped = !this.flipped;
    }
}

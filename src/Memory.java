
/**
 * Memory Game
 *
 * @author Jeff Manning <info@jeffmanning.ca>
 * @version 1.0.0
 */

import java.util.Iterator;

public class Memory
{
    public static void main(String args[]) {
        Memory game = new Memory();
    }
    
    public Memory() {
        Deck deck = new Deck();
        while(!deck.isEmpty()) {
            Card currentCard = deck.getNextCard();
            System.out.println(currentCard.getValue() + currentCard.getSuite());
        }
    }
    
}

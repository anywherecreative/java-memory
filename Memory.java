
/**
 * Memory Game
 *
 * @author Jeff Manning <info@jeffmanning.ca>
 * @version 1.0.0
 */
public class Memory
{
    public static void main(String args[]) {
        Memory game = new Memory();
    }
    
    public Memory() {
        Card first = new Card("A",Card.SPADES);
        Card second = new Card("A",Card.SPADES);
        
        System.out.println(first.isCard(new Card("K",Card.HEARTS)));
    }
    
}

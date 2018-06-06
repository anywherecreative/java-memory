/**
 * Deck of Cards
 *
 * @author Jeff Manning
 * @version 1.0.0
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Deck
{
    private List<Card> deck;
    private Iterator<Card> deckIterator;
    public Deck() {
        deck = new ArrayList<Card>();
        String cardValue = "";

        //load a standard deck of cards into our deck
        for(int a = 1;a <= 13; a++) {
            switch(a) {
                case 1:
                    cardValue = "A";
                    break;
                case 11:
                    cardValue = "J";
                    break;
                case 12:
                    cardValue = "Q";
                    break;
                case 13:
                    cardValue = "K";
                    break;
                default:
                    cardValue = Integer.toString(a);
            }
            deck.add(new Card(cardValue,Card.SPADES));
            deck.add(new Card(cardValue,Card.CLUBS));
            deck.add(new Card(cardValue,Card.HEARTS));
            deck.add(new Card(cardValue,Card.DIAMONDS));
        }
        
        //shuffle the cards
        Collections.shuffle(deck);
        
        deckIterator = deck.iterator();
    }
    
    public Card getNextCard() {
        return deckIterator.next();
    }
    
    public boolean isEmpty() {
        return !deckIterator.hasNext();
    }
    
}

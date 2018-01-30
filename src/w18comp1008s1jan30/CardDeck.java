package w18comp1008s1jan30;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class CardDeck {
    private ArrayList<Card> deck;
    
    /**
     * This is a 0 argument constructor
     */
    public CardDeck()
    {
        deck = new ArrayList<>();
        String[] faceNames = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] suits = {"spades","clubs","diamonds","hearts"};
        
        for (int suit=0; suit<suits.length; suit++)
        {
            for (int face=0; face<faceNames.length; face++)
                deck.add(new Card(faceNames[face], suits[suit], face+2));
        }
    }
    
    public void displayDeck()
    {
        for (Card card:deck)
            System.out.println(card);
    }
}

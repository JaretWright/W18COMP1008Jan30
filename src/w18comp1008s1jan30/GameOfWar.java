package w18comp1008s1jan30;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class GameOfWar
{
    ArrayList<Card> p1Hand;
    ArrayList<Card> p2Hand;
    
    /**
     * The constructor will initialize the hands and build the deck of cards
     */
    public GameOfWar()
    {
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();
        
        CardDeck deck = new CardDeck();
        deck.shuffle();
        
        while(deck.getNumOfCardsInDeck()>0)
        {
            p1Hand.add(deck.dealTopCard());
            p2Hand.add(deck.dealTopCard());
        }
    }
    
    /**
     * This method will continously play hands until there is a winner
     */
    public void playGame()
    {
        while (p1Hand.size() >0 && p2Hand.size() >0)
        {
            ArrayList<Card> warPile = new ArrayList<>();
            playHand(warPile);
        }
    }
    
    
    /**
     * This simulates playing 1 hand of war
     */
    public void playHand(ArrayList<Card> warPile)
    {
        Card p1Card = p1Hand.remove(0);
        Card p2Card = p2Hand.remove(0);
        
        //player 1 wins
        if (p1Card.getFaceValue() > p2Card.getFaceValue())
        {
            p1Hand.add(p1Hand.size(), p1Card); //put the card at the back of the hand
            p1Hand.add(p1Hand.size(), p2Card); //put the card at the back of the hand
            p1Hand.addAll(p1Hand.size(), warPile);
            return;
        }
        //player 2 wins
        else if (p2Card.getFaceValue() > p1Card.getFaceValue())
        {
            p2Hand.add(p2Hand.size(), p1Card); //put the card at the back of the hand
            p2Hand.add(p2Hand.size(), p2Card); //put the card at the back of the hand
            p2Hand.addAll(p2Hand.size(), warPile);
            return;
        }
        else //it must be war!!!
        {
            warPile.add(p1Card);
            warPile.add(p2Card);
            
            //check that P1 has enough cards, if they don't have enough
            //cards give all cards to player 2
            if (p1Hand.size() < 4){
                p2Hand.addAll(warPile);
                p2Hand.add(p1Card);
                p2Hand.add(p2Card);
                p2Hand.addAll(p1Hand);
                return;
            }
            else if (p2Hand.size() < 4)
            {
                p1Hand.addAll(warPile);
                p1Hand.add(p1Card);
                p1Hand.add(p2Card);
                p1Hand.addAll(p2Hand);
                return;
            }
            //both players have enough cards
            warPile.add(p1Hand.remove(0));
            warPile.add(p1Hand.remove(0));
            warPile.add(p1Hand.remove(0));
            warPile.add(p2Hand.remove(0));
            warPile.add(p2Hand.remove(0));
            warPile.add(p2Hand.remove(0));
            
            playHand(warPile);
        }
            
        
        
    }
}

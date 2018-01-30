
package w18comp1008s1jan30;

/**
 *
 * @author JWright
 */
public class DeckTester {
    public static void main(String[] args)
    {
        CardDeck deck = new CardDeck();
        deck.shuffle();
        deck.displayDeck();
        
        System.out.printf("The top card is %s %n", deck.dealTopCard());
        
        System.out.printf("Our random card is %s%n", deck.getRandomCard());
        
        
    }
}

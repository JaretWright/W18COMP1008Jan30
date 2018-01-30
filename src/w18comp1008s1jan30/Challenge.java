
package w18comp1008s1jan30;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class Challenge {
    public static void main(String[] args)
    {
        ArrayList<String> favGames = new ArrayList<>();
        favGames.add("CS:GO");
        favGames.add("Lego Ninjago:Shadow of Ronin");
        favGames.add("League of Legends");
        
        System.out.printf("The best games are: %s%n", favGames.toString());
        
        //using a for loop to display the contents of the ArrayList
        //option 1 - a traditional for loop
        for (int i=0; i<favGames.size(); i++)
            System.out.println(favGames.get(i));
        
        //option 2 - iterate over the collection
        //the type of data in each position is a String
        //game - this is teh variable given for the object in each 
        //       position of the ArrayList
        //favGames - the name of the list we want to iterate over
        for (String game:favGames)
            System.out.println(game);
        
        //generic ArrayList
        ArrayList stuff = new ArrayList();
        stuff.add("Messy room");
        stuff.add(100);
        stuff.add(99.9);
        
        for (Object item:stuff)
        {   
            System.out.printf("%s is of type %s%n", item.toString(), item.getClass());
        }
        
        
        
    }
}

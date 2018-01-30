package w18comp1008s1jan30;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S1Jan30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //This defines an array list that holds objects of type Double
        //if you do not use <Double> it can hold any type of object
        ArrayList<Double> grades = new ArrayList<>();
        System.out.printf("Charlie's grades: %s%n", grades);
        grades.add(new Double(100));
        grades.add(new Double(99.9));
        grades.add(new Double(99.8));

        //create an ArrayList of people that are playing video games during the class
        ArrayList<Double> grades2 = new ArrayList<>();
        System.out.printf("Charlie's grades: %s%n", grades);
        
        
        
        grades2.add(new Double(66.9));
        grades2.add(new Double(70.1));
        grades2.add(new Double(72));
        
        //if you want to combine 2 ArrayLists, just use addAll
        grades.addAll(grades2);
        
        System.out.printf("Charlie's grades: %s%n", grades);
        
        //to remove a grade
        Double lastGrade = grades.remove(grades.size()-1);
        System.out.printf("Charlie's grades: %s%n", grades);
        System.out.printf("The last grade removed is: %.1f%n", lastGrade);
        
        
        int indexOfGrade = grades.indexOf(66.9);
        Double charliesRequestedGrade = grades.remove(indexOfGrade);
        
        System.out.printf("Charlie's grades now: %s%n", grades);
        System.out.printf("The last grade removed is: %.1f%n", charliesRequestedGrade);
        
        for (int i=0; i<grades.size(); i++)
        {
            System.out.println(grades.get(i));
        }
    }
    
}

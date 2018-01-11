import java.util.Scanner;
/**
 * Write a description of class Tester1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester1
{
    public void main()
    {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("Enter an animal: ");
        String guess = aScanner.nextLine();
        String[] words1 = {"ant", "bee", "cat", "dog", "elephant", "fish", "goat", "horse"};
        boolean foundOrNot = false;
        
        for (int index = 0; index<words1.length; index++)
        {
            if (guess.equalsIgnoreCase(words1[index]))
            {
                foundOrNot = true;
            } 
        }
        
        if (foundOrNot == true)
        {
            System.out.println("Found: " + guess);
        } else {
            System.out.println("Not found");
        }
        foundOrNot = false;
        
    }
    
    
}

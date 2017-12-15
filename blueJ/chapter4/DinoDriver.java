import java.util.*;
/**
 * Write a description of class DinoDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver
{
    public static void main(String[] args)
    {
        // Dinosaur rex = new TRex();
        // rex = DinoDriver.randomAge(rex);
        // System.out.println(rex.dinosaurString());
        
        Dinosaur one = new TRex();
        Dinosaur two = new TRex();
        System.out.println(one.attack(two));
        System.out.println(one.dinosaurString() + "\n" + two.dinosaurString());
    }
    
    public static Dinosaur randomAge(Dinosaur ager)
    {
        // Random rand = new Random();
        // int randAge = rand.nextInt(34);
        int randAge = (int)(Math.random()*34);
        
        // while (randAge != 0)
        // {
            // ager.ageUp();
            // randAge-=1;
        // }
        
        for (int index = 0; index<randAge; index++)
        {
            ager.ageUp();
        }
        return ager;
        
    }
}

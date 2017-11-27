import java.util.Random;
/**
 * Write a description of class random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class randomizer

{
    private int newRandomNumber, totalNumbers; 
    private int frequency0 = 0;
    private int frequency1 = 0;
    private int frequency2 = 0;
    private int frequency3 = 0;
    private int frequency4 = 0;
    private int frequency5 = 0;
    private int frequency6 = 0;
    private int frequency7 = 0;
    private int frequency8 = 0;
    private int frequency9 = 0;
    
    Random ran = new Random();
    
    public randomizer()
    {
        newRandomNumber = 0;
        totalNumbers = 0;
        
    }

    public int randomize()
    {
        newRandomNumber = ran.nextInt(9);
        
        if      (newRandomNumber == 0) { frequency0 += 1; }
        else if (newRandomNumber == 1) { frequency1 += 1; }
        else if (newRandomNumber == 2) { frequency2 += 1; }
        else if (newRandomNumber == 3) { frequency3 += 1; }
        else if (newRandomNumber == 4) { frequency4 += 1; }
        else if (newRandomNumber == 5) { frequency5 += 1; }
        else if (newRandomNumber == 6) { frequency6 += 1; }
        else if (newRandomNumber == 7) { frequency7 += 1; }
        else if (newRandomNumber == 8) { frequency8 += 1; }
        else if (newRandomNumber == 9) { frequency9 += 1; }
    }
}

import java.util.Random;
/**
 * Write a description of class random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class randomizer

{
     int newRandomNumber, totalNumbers; 
     int frequency0;
     int frequency1;
     int frequency2;
     int frequency3;
     int frequency4;
     int frequency5;
     int frequency6;
     int frequency7;
     int frequency8;
     int frequency9;
    
    Random ran = new Random();
    
    public randomizer()
    {
        newRandomNumber = 0;
        totalNumbers = 0;
        
        frequency0 = 0;
        frequency1 = 0;
        frequency2 = 0;
        frequency3 = 0;
        frequency4 = 0;
        frequency5 = 0;
        frequency6 = 0;
        frequency7 = 0;
        frequency8 = 0;
        frequency9 = 0;
    }

    public void randomize()
    {
        newRandomNumber = ran.nextInt(10);
        System.out.println(totalNumbers); 
        System.out.println(newRandomNumber); 
        totalNumbers += 1;
        
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
       
        
        System.out.println("0: " + (frequency0 * 100 /totalNumbers) + "% (" + frequency0 + ")");
        System.out.println("1: " + (frequency1 * 100 /totalNumbers) + "% (" + frequency1 + ")");
        System.out.println("2: " + (frequency2 * 100 /totalNumbers) + "% (" + frequency2 + ")");
        System.out.println("3: " + (frequency3 * 100 /totalNumbers) + "% (" + frequency3 + ")");
        System.out.println("4: " + (frequency4 * 100 /totalNumbers) + "% (" + frequency4 + ")");
        System.out.println("5: " + (frequency5 * 100 /totalNumbers) + "% (" + frequency5 + ")");
        System.out.println("6: " + (frequency6 * 100 /totalNumbers) + "% (" + frequency6 + ")");
        System.out.println("7: " + (frequency7 * 100 /totalNumbers) + "% (" + frequency7 + ")");
        System.out.println("8: " + (frequency8 * 100 /totalNumbers) + "% (" + frequency8 + ")");
        System.out.println("9: " + (frequency9 * 100 /totalNumbers) + "% (" + frequency9 + ")");
        
    }
}

import java.util.Scanner;

public class junk
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class junk
     */
    public junk()
    {
        x = 0;
    }

    public static void scanThingsIGuess()
    {
        Scanner aScan = new Scanner(System.in);
        
        System.out.println("enter thing:");
        int thing = aScan.nextInt();
        System.out.println(thing);
    }
}

import java.util.Scanner;

/**
 * creates a new bird and continues feeding it information 
 * until you say some variant of goodbye
 *
 * @Kelly Wong
 * @October 2017
 */

public class ThisRunsTheMagpie
{
    public static void main(String[] args)
    {
        MagpieTwo birb = new MagpieTwo();
        
        System.out.println(birb.greeting());
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        while (!input.equalsIgnoreCase("Bye"))
        {
            System.out.println(birb.conversation(input));
            input = in.nextLine();
        }
    }
}

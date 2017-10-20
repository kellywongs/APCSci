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
        Magpie birb = new Magpie();
        
        System.out.println(birb.greeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();
        
        while (!statement.equalsIgnoreCase("Bye"))
        {
            System.out.println(birb.conversation(statement));
            statement = in.nextLine();
        }
    }
}

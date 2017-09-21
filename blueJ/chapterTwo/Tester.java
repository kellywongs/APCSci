import java.util.Scanner;

/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //special constructor, requires parameter 
        
        String password;
        Boolean strongPass = false;
        System.out.println("Enter password: ");
        password = scan.nextLine();
        
        while (strongPass == false)
        {
            if (password.length() > 8)
            {
                System.out.println("Ha nice");
                strongPass = true;
            } else {
                System.out.println("You have a crappy password. Try again");
                password = scan.nextLine();
            }
        }
        
    }
}

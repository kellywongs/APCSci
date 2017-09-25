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
        String password = "Carmel Padres";
        String userPass; 
    
        Scanner scan = new Scanner(System.in); //special constructor, requires parameter 
        Scanner scan2 = new Scanner(System.in);
        
        Boolean strongPass = false;
        
        System.out.println("Enter school password: ");
        String comparePass = scan2.nextLine();
        
        if (comparePass.equals(password)) 
        {
            System.out.println("Good for u. Enter your own password: ");
            userPass = scan.nextLine();
            
        
            while (strongPass == false)
            {
                if (userPass.equals(password))
                {
                    System.out.println("How about using your own password buddy");
                    userPass = scan.nextLine();
                } else if (userPass.toUpperCase().equals("CARMEL PADRES") ||
                           userPass.toUpperCase().equals("CARMELPADRES")) {
                    System.out.println("Yeah nice try it's case sensitive");
                    userPass = scan.nextLine();
                } else {
                    if (userPass.length() > 8)
                    {
                        System.out.println("Ha nice");
                        System.out.println("Encrypting... ");
                        strongPass = true;
                        
                    } else {
                        System.out.println("Increase entropy & try again");
                        userPass = scan.nextLine();
                    }
                }
            }
        
            userPass.encryption();
        } else {
            System.out.println("T-t-t-t-t-try again");
            comparePass = scan.nextLine();
        }
    }
    
    public static String encryption(userPass)
    {
        int passCounter = 0;
        
        while (passCounter != userPass.length())
        {
            System.out.println("passCounter");
            passCounter = userPass.charAt(passCounter+=1);
        }
    }
}

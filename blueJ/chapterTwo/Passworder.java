import java.util.Scanner;

public class Passworder
{
    
    public Passworder()
    {
       
    }

    public static void main()
    {
        Scanner accountCreator = new Scanner(System.in);
        Scanner passwordCreator = new Scanner(System.in);
        Scanner passwordChecker = new Scanner(System.in);
        boolean commandRecognized = false;
    
        System.out.print("create an account or log in? ");
        String initialResponse = accountCreator.next();
        
        while (commandRecognized == false) 
        {
            if (initialResponse.charAt(0) == 'c' ||
                initialResponse.charAt(0) == 'C')
            {
                commandRecognized = true;
                System.out.println("account creation initiated.");
                System.out.print("enter a password: ");
                String password = passwordCreator.next();
                
                boolean strongPass = false;
                
                while (strongPass == false)
                {
                    if (password.length() <= 8)
                    {
                        System.out.println("your password is too short!");
                        System.out.println("increase entropy and try again");
                        System.out.print("enter password: ");
                        password = passwordCreator.next();
                    } else {
                        System.out.print("acceptable password, have a horrible day");
                        strongPass = true;
                    }
                }
            } else if (initialResponse.charAt(0) == 'l' ||
                       initialResponse.charAt(0) == 'L')
            {
                commandRecognized = true;
                
                System.out.print("please enter organization password: ");
                String organizationPassword = "Carmel Padres";
                boolean passwordMatches = false;
                String passwordCheck = passwordChecker.next();
                
                while (passwordMatches == false)
                {
                    if (passwordCheck.equals(organizationPassword))
                    {
                        System.out.println("nice going");
                        passwordMatches = true;
                    } else if (passwordCheck.equalsIgnoreCase(organizationPassword))
                    {
                        System.out.println("password is case sensitive");
                        System.out.print("enter organization password: ");
                        passwordCheck = passwordChecker.next();
                    } else 
                    {
                        System.out.println("you're just wrong sorry, ");
                        // System.out.print("enter organization password: ");
                        passwordMatches = false;
                        passwordCheck = passwordChecker.next();
                        
                    }
                }
                
            } else 
            {
                System.out.println("command '" + initialResponse + "' not recognized");
                System.out.print(": ");
                initialResponse = accountCreator.next();
            }
        }
    }
}

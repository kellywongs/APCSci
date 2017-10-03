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
                initialResponse.charAt(0) == 'C' ||
                initialResponse.charAt(0) == '1')
            {
                commandRecognized = true;
                
                if (initialResponse.charAt(0) == '1')
                {
                    System.out.println("getting a little pedantic, are we?");
                }
                
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
                        System.out.println("acceptable password, have a horrible day");
                        strongPass = true;
                    }
                }
            } else if (initialResponse.charAt(0) == 'l' ||
                       initialResponse.charAt(0) == 'L' ||
                       initialResponse.charAt(0) == '2')
            {
                commandRecognized = true;
                
                if (initialResponse.charAt(0) == '2')
                {
                    System.out.println("getting a little pedantic, are we?");
                }
                
                System.out.println("login initiated, ");
                System.out.print("please enter organization password: ");
                String organizationPassword = "Carmel Padres";
                boolean passwordMatches = false;
                String passwordCheck = passwordChecker.nextLine();
                
                while (passwordMatches == false)
                {
                    if (passwordCheck.equals(organizationPassword))
                    {
                        System.out.println("nice going");
                        passwordMatches = true;
                        
                        
                    } else if (passwordCheck.equalsIgnoreCase(organizationPassword) &&
                               passwordCheck.equals(organizationPassword) == false)
                    {
                        System.out.println("password is case sensitive");
                        System.out.print("enter organization password: ");
                        passwordCheck = passwordChecker.nextLine();
                    } else 
                    {
                        System.out.println("you're just wrong sorry, ");
                        System.out.print("enter organization password: ");
                        // passwordMatches = false;
                        passwordCheck = passwordChecker.nextLine();
                        System.out.println(passwordCheck);
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

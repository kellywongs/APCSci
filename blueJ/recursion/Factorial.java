
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String[] args) 
    {
        System.out.println(Factorial(6));
    }
    
    public static int Factorial(int num)
    {
        if (num >1 )
        {
           return Factorial(num-1) * num;
        }
        else { return 1; }
    }
}

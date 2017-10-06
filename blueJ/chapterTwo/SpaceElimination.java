import java.util.Scanner;
/**
 * Write a description of class StringThing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpaceElimination
{
    /*
     * algorithm:
     * 1. while there are still spaces in stringVariable,
     * 2. add the first nonspaced word to finalString
     * 3. delete that word plus the space after it from the original stringVariable
     * 4. the 0 index is now the start of the next word, rinse and repeat
     * 
     * ..
     * x. finally print out your finalString plus the straggler word
     *    from the original stringVariable
     */
    public static void main(String[] args)
    {
        String finalString = "";
        
        Scanner stringVariableScanner = new Scanner(System.in);
        System.out.print("enter string variable: ");
        String s = stringVariableScanner.nextLine();
        String stringVariable = s;
        
        while (stringVariable.indexOf(" ") != -1)
        {
            finalString += stringVariable.substring(0, stringVariable.indexOf(" "));
            stringVariable = stringVariable.substring(stringVariable.indexOf(" ")+1);
        }
        
        System.out.println(finalString + stringVariable);
        
        // letter by letter by letter
        int indexCount = 0;
        String letterByLetter = "";
        
        while (indexCount != s.length())
        {
            if (s.charAt(indexCount) != ' ') 
            {
                letterByLetter += s.charAt(indexCount);
            }
            
            indexCount += 1;
        }
        
        System.out.println(letterByLetter);
    }
}

import java.util.Scanner;

/**
 * Write a description of class Sorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorter
{
    public static void main(String[] args) {
        SorterController control = new SorterController();
        
        int[] list = new int[20];
        control.newIntList(list);
        
        Scanner input = new Scanner(System.in);
        while (1==1) {
            System.out.println("action?");
            String nextAction = input.nextLine();
            control.actionTaker(nextAction, list);
           
        }
    }
    
    
}

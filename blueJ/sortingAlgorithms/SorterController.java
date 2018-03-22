import java.util.Scanner;
/**
 * Write a description of class SorterController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SorterController extends Sorter
{
    
    
    public void actionTaker(String nextAction, int[] list)
    {
        switch (nextAction.toLowerCase()) {
            case "new list": System.out.println("length?");
                Scanner length = new Scanner(System.in);
                newIntList(list);
                break;
            case "bubble": System.out.println("bubble sort: ");
                
        }
    }
    
    public int[] newIntList(int[] oldList)
    {
        int[] list = new int[oldList.length];
        SorterController controller = new SorterController();
        
        System.out.println("unsorted list:");
        for (int integers = 0; integers < list.length; integers++)
        {
            list[integers] = (int)(Math.random()*(2*list.length));
            
        }
        printList(list);
        oldList = list;
        return list;
    }
    
    public void printList (int[] list)
    {
        int counter = 0;
        for (int integers = 0; integers < list.length; integers++)
        {
            
            if (counter <= 10)
            {
                System.out.print(list[integers] + ", ");
                counter += 1;
            } else
            {
                System.out.print("\n" + list[integers] + ", ");
                counter = 0;
            }
        }
    }
}

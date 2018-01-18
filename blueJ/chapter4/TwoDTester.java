
/**
 * Write a description of class TwoDTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDTester
{
    public static void main(String[] args) {
        int[][] nums = new int[5][8];
        
        for (int index = 0; index<nums.length; index++)
        {   System.out.println();
            for (int anotherIndex : nums[index])
            {
                nums[index][anotherIndex] = 3;
                System.out.print(nums[index][anotherIndex]+ " ");
            }
        }
        
       
        
    }
}

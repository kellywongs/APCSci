
/**
 * Write a description of class IntSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntSort
{
    public static void main(String[] args)
    {
        int[] randomInts = new int[20];

        System.out.println("**************** ORIGINAL *****************");
        for (int count = 0; count < randomInts.length; count ++)
        {
            randomInts[count] = (int)((Math.random() * 150)) + 20;
            System.out.println(randomInts[count]);
        }

        for (int count = 0; count < randomInts.length; count++)
        {
            int lowestIndex = count;

            for (int iterator = count+1; iterator < randomInts.length; iterator++) {
                
                if (randomInts[lowestIndex] > randomInts[iterator])
                {
                    lowestIndex = iterator;
                }
            }

            int tempHigherNumber = randomInts[count];
            randomInts[count] = randomInts[lowestIndex];
            randomInts[lowestIndex] = tempHigherNumber;
        }

        System.out.println("**************** SORTED *****************");
        for (int count = 0; count < randomInts.length; count ++)
        {
            System.out.println(randomInts[count]);
        }
    }
}

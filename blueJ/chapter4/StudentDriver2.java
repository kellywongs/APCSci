import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentDriver2
{

    private static final String FILENAME = "textTester.txt";

    public static void main(String[] args) 
    {

        BufferedReader br = null;
        FileReader fr = null;
        Student[] myClass = new Student[65];
        int i=0;

        try 
        {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;
            int rand = 200;

            while ((sCurrentLine = br.readLine()) != null) 
            {
                int index = sCurrentLine.indexOf(" ");
                String f = sCurrentLine.substring(0, index);
                String l = sCurrentLine.substring(index+1);
                rand = (int)(Math.random()*900)+100;
                double randGPA = ((int)(Math.random()*450))/100.0;
                if (Math.random() > 0.5) {
                    myClass[i] = new Student(f, l, "male", 9, rand, randGPA);
                }
                else {
                    myClass[i] = new Student(f, l, "female", 9, rand, randGPA);
                }
                i++;

            }

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        
        
        for(int j = 0; j<myClass.length; j++){
            System.out.println(myClass[j].toString());}
        
        int highestIndex = 0;
        double highestGPA = myClass[0].getGPA(); 
        String highestGPAStudent = myClass[0].getFirstName() + " " + myClass[0].getLastName();
        for (int indexer = 0; indexer<myClass.length; indexer++)
        {
            if (myClass[indexer].getGPA() > highestGPA)
            {
                highestIndex = indexer;
            }
        }
        System.out.println("highest GPA: " + myClass[highestIndex].getFirstName() + 
                 " " + myClass[highestIndex].getLastName() + 
        " " + myClass[highestIndex].getGPA());
        
        Student temp = myClass[0];
        myClass[0] = myClass[highestIndex];
        myClass[highestIndex] = temp;
    // }
    
    // private static void countGirls(Student[] group) 
    // {
        int girls = 0;
        
        for (int indexer = 0; indexer<myClass.length; indexer++)
        {
            if (myClass[indexer].getGender().equals("female"))
            { 
             girls += 1;
            }
        }
        System.out.println("girls: " + girls);
    }
}
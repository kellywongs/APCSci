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
                if (Math.random() > 0.5) {
                    myClass[i] = new Student(f, l, "male", 9, rand, 0.0);
                }
                else {
                    myClass[i] = new Student(f, l, "female", 9, rand, 0.0);
                }
                i++;

            }

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        
        for(int j = 0; j<myClass.length; j++)
            System.out.println(myClass[j].toString());

    }
    
  
}
import java.util.*;

/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables are declared
    private double gpa;
    private int grade, idNum, units;
    private String firstName, lastName, gender;

    // DEFAULT constructor for objects of class student, makes generic object
    
    public Student()
    {
        // initialise instance variables
        this.gpa = 0.0;
        this.units = 0;
        this.grade = 9;
        this.idNum = 0000;
        this.firstName = "John";
        this.lastName = "Appleseed";
        if ((int)(Math.random()*2) == 0) { this.gender = "female"; }
            else                         { this.gender = "male  "; }
            
    }
    
    // explicit constructor for student class, makes explicit student - comes
    // with parameters (not a good idea.)
    
    public Student(String firstS, String lastS, String genderS, 
        int gradeS, int idS, double gpaS) 
    //construction sig ^
    { //constructor definition 
        this.gpa = gpaS;
        this.grade = gradeS;
        this.idNum = idS;
        this.firstName = firstS;
        this.lastName = lastS;
        this.gender = genderS;
    }
    
    // getters/setters
    
    public double getGPA()
    {
        return this.gpa;
    }
    
    public void setGPA(double original)
    {
        this.gpa = original;
    }
    
    public int getGrade()
    {
        return this.grade;
    }
    
    public void setGrade(int original)
    {
        this.grade = original;
    }
    
    public int getID()
    {
        return this.idNum;
    }
    
    public void setID(int original)
    {
        this.idNum = original;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String original)
    {
        this.firstName = original;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setLastName(String original)
    {
        this.lastName = original;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public void setGender(String original)
    {
        this.gender = original;
    }
    
    public boolean areEqual(Student other)
    {
        if (other.getID() == this.getID())
        {
            return true;
        } else {
            return false;
        }
    }

    public String toString()
    { 
        String ans = this.firstName + " " + this.lastName + " " + 
                     this.gender + " " + this.grade + 
                     " ID: " + this.idNum +
                     " GPA: " + this.gpa;
        return ans;
    }
}

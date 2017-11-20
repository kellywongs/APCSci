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
    private int grade, idNum;
    private String firstName, lastName, gender;

    // DEFAULT constructor for objects of class student, makes generic object
    
    public Student()
    {
        // initialise instance variables
        this.gpa = 0.0;
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
    
    public void setGPA(double originalGPA)
    {
        this.gpa = originalGPA;
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

import java.util.*;

/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables are decl  ared
    private double gpa;
    private int grade, idNum;
    private String firstName, lastName, gender;

    /**
     * DEFAULT constructor for objects of class student
     */
    public Student()
    {
        // initialise instance variables
        this.gpa = 0.0;
        this.grade = 9;
        this.idNum = 0000;
        this.firstName = "John";
        this.lastName = "Appleseed";
        if (((int)(Math.random()*10)+1)%2 == 0) { this.gender = "female"; }
            else                                { this.gender = "male"; }
            
    }

    public String toString()
    { 
        while (1==1) {
        String ans = this.firstName + " " + this.lastName + " " + 
                     this.gender + " " + this.grade + " GPA: " + this.gpa;
        return ans;
    }
    }
}

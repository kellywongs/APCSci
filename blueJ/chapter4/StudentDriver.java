
/**
 * Write a description of class StudentDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentDriver
{
    public static void main(String[] args) {
        
        
        
        Student kelly = new Student("Kelly", "Wong", "female", 11, 7966, 9.0);
        Student anotherKelly = new Student("Kelly", "Wong", "female", 11, 7966, 9.0);
        Student notKelly = new Student("Not", "Kelly", "male", 11, 1924, 9.0);
        
        
            Student kid = new Student();
            System.out.println(kid.toString());
            System.out.println(kelly.toString());
            kelly.setGPA(4.0);
            System.out.println(kelly.getGPA());
        
        
        System.out.println(kelly.areEqual(anotherKelly));
        System.out.println(kelly.areEqual(notKelly));
    }
}

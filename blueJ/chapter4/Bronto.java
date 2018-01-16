
/**
 * Write a description of class Bronto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bronto extends Dinosaur
{
    public Bronto() {
        this.setWeight(this.getWeight()+100);
        this.setType("brontosaurus");
        
    }
    
    
    public double calcFactor (Dinosaur other)
    {
        double factor = 1;
        
        if (other.getType().equals("t rex"))
        {
            factor = 0.8;
        } else if (other.getType().equals("stegosaurus"))
        {
            factor = 0.9999;
        } 
        return factor;
    }
}

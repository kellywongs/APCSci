
/**
 * Write a description of class Stego here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stego extends Dinosaur
{
    public Stego() {
        this.setWeight(this.getWeight()+40);
        this.setType("stegosaurus");
        
    }
    
    
    public double calcFactor (Dinosaur other)
    {
        double factor = 1;
        
        if (other.getType().equals("t rex"))
        {
            factor = 0.999;
        } else if (other.getType().equals("brontosaurus"))
        {
            factor = 1;
        } 
        return factor;
    }
}


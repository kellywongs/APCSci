
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    public TRex() {
        this.setWeight(this.getWeight()+50);
        this.setType("t rex");
        
    }
    
    
    public double calcFactor (Dinosaur other)
    {
        double factor = 1;
        
        if (other.getType().equals("brontosaurus"))
        {
            factor = 1.3;
        } else if (other.getType().equals("stegosaurus"))
        {
            factor = 1.1;
        } 
        return factor;
    }
}

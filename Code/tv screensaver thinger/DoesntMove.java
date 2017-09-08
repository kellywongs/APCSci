import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoesntMove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoesntMove extends Actor
{
    private int direction;
    private int stamp;
    private int counter;
    
    /**
     * Act - do whatever the DoesntMove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public DoesntMove()
    {
        GreenfootImage image = getImage();
        image.scale(50, 25);
    }
    
    public void act() 
    {
        counter ++;
        if (counter == 100)
        {
            World w = this.getWorld();
            w.removeObject(this);
        }
    }    
}

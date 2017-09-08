import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnekTrail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnekTrail extends Snek
{
    private int lengthCounter;
    
    public SnekTrail()
    {
        GreenfootImage image = getImage();
        image.scale(25, 25);
        
        
    }
    
    public void act() 
    {
        snekGame();
    }    
    
    public void snekGame()
    {
        World w = this.getWorld();
        lengthCounter ++;
        
        if (lengthCounter == 50)
        {
            w.removeObject(this);
        }
    }
    
}

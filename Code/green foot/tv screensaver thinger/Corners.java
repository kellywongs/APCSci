import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Corners here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corners extends Actor
{
    /**
     * Act - do whatever the Corners wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Corners() 
    {
        GreenfootImage gfi = new GreenfootImage(2,2);
        setImage(gfi);
    }
    
    public void act() 
    {
        if (this.isTouching(Logo.class)) 
        {
            World w = getWorld();
            w.addObject(new Cactus(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
        }
    }    
}

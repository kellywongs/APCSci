import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grass extends Actor
{
    /**
     * Act - do whatever the Grass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage cutAlligator = new GreenfootImage("cut alligator.png");
    
    public Grass() 
    {
        setRotation(90);
    }
    
    public void act() 
    {
        if (this.isTouching(Lawnmower.class))
        {
            setImage(cutAlligator);
            
        }
    }    
}

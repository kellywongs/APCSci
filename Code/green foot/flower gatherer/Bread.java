import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends Actor
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int stepCounter;
     private int lifeLength;
    
    public Bread() { // initialized outside and set to its first value in the constructor
        this.stepCounter = 0;
        this.lifeLength = 300;
    }
    
    public void act() 
    {
        if (stepCounter != lifeLength)
        {
            this.stepCounter ++;
        } else {
            World w = this.getWorld();
            w.removeObject(this);
        }
    } 
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private int stepCounter;
     private int lifeLength;
    
    public Flower() { // initialized outside and set to its first value in the constructor
        this.stepCounter = 0;
        this.lifeLength = 300;
    }
    
    public void act() 
    {
        // if (stepCounter == Greenfoot.getRandomNumber(100))
        // {
           
           // w.addObject(new this, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        // }
        
        if (stepCounter != lifeLength)
        {
            this.stepCounter ++;
        } else {
            World w = this.getWorld();
            w.removeObject(this);
        }
    }    
}

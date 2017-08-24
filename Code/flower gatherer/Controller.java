import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends Actor
{
    /**
     * Act - do whatever the Controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int stepCounter;
    private int number;
    
    public Controller()
    {
        this.stepCounter = 0;
        this.number = 15;
    }
    
    public void act() 
    {
        this.stepCounter ++;
        
        if (stepCounter == Greenfoot.getRandomNumber(number))
        {
            World w = getWorld();
            w.addObject(new Flower(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
            this.stepCounter = 0;
        } else if (stepCounter > number)
        {
            this.stepCounter = 0;
        }
       
    }    
}

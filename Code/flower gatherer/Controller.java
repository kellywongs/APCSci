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
    private int breadCounter;
    private int number;
    private int evenRarerNumber;
    
    public Controller()
    {
        this.stepCounter = 0;
        this.breadCounter = 0;
        this.number = 15;
        this.evenRarerNumber = 100;
    }
    
    public void act() 
    {
        this.stepCounter ++;
        this.breadCounter ++;
        
        if (stepCounter == Greenfoot.getRandomNumber(number))
        {
            World w = getWorld();
            w.addObject(new Flower(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
            this.stepCounter = 0;
        } else if (stepCounter > number)
        {
            this.stepCounter = 0;
        }

        if (breadCounter == Greenfoot.getRandomNumber(evenRarerNumber))
        {
            World w = getWorld();
            w.addObject(new Bread(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
            this.stepCounter = 0;
        } else if (breadCounter > evenRarerNumber)
        {
            this.breadCounter = 0;
        }
       
    }    
}

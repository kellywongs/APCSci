import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int stepCounter;
    public int score;
    public int moveFor;
    
    public void Sheep()
    {
        stepCounter = 0;
        score = 0;
        moveFor = Greenfoot.getRandomNumber(100);
    }
    
    public void act() 
    {
        if (stepCounter <= moveFor)
        {
            this.move(5);
            this.stepCounter ++;
            
            if (this.isAtEdge())
            {
                this.turn(180);
            }
        } else 
        {
            this.moveFor = Greenfoot.getRandomNumber(100);
            this.stepCounter = 0;
            this.turn(40);
        }
        
        if (this.isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            System.out.println(score ++);
        }
        
        if (this.isTouching(Sheep.class))
        {
            World w = getWorld();
            w.addObject(new Sheep(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
        }
    }    
}
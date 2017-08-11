import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plant extends Actor
{
    /**
     * Act - do whatever the plant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.move(-5);
        if(this.isAtEdge() == true) 
        {
            this.turn(170);
        }
    }
}


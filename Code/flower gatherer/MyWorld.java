import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void randomFlower()
    {
        addObject(new Flower(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        this.randomFlower();
        
        addObject(new Controller(), 0, 0);
        addObject(new Sheep(), getWidth()/2-100, getHeight()/2);
        addObject(new Stats(), getWidth()-30, getHeight()-30);
    }
}

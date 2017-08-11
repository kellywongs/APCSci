import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyHeckingWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */ 
    public MyHeckingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        
        Plant c0 = new Plant(); //makes a new cactus
        this.addObject(c0, 10, 10);
        Plant c = new Plant(); //makes a new cactus
        this.addObject(c, 110, 110);
        Plant c1 = new Plant(); //makes a new cactus
        this.addObject(c1, 210, 210);
    }
}

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

        plant c = new plant(); //makes a new cactus

        this.addObject(c, 110, 110);
        this.addObject(c, 110, 310);
    }
}

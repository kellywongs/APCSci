import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snek extends Actor
{
    public int lengthCounter;
    public int length;
    public int difficulty;
    public int rotate;
    
    public boolean leftIsDown, rightIsDown, upIsDown, downIsDown;
    
    public Snek()
    {
        GreenfootImage image = getImage();
        image.scale(25, 25);
        
        difficulty = 1;
    }
    
    public void act() 
    {
        snekGame();
    }    
    
    public void snekGame()
    {
        World w = this.getWorld();
        lengthCounter ++;
        
        move(difficulty);
        
        if (lengthCounter == difficulty*15)
        {
            w.addObject(new SnekTrail(), getX(), getY());
            lengthCounter = 0;
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            if (leftKeyDown == false)
            
        }
    }
    
}

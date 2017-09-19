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
    
    public int rockSpawner;
    public int grassSpawner;
    
    public void act() 
    {
        World w = getWorld();
        
        
        
        if (grassSpawner == 5)
        {
           
            w.addObject(new Grass(), Greenfoot.getRandomNumber(w.getWidth()), w.getHeight()-Greenfoot.getRandomNumber(100));
            grassSpawner = 0;
        } else 
        {
            grassSpawner ++;
        }
        
        if (rockSpawner >= 100)
        {
            w.addObject(new Rock(), Greenfoot.getRandomNumber(w.getWidth()), w.getHeight()-Greenfoot.getRandomNumber(50));
            rockSpawner = 0;
        } else {
            rockSpawner += Greenfoot.getRandomNumber(5);
        }
    }    
}

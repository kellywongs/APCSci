import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant extends Actor
{
    /**
     * Act - do whatever the plant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int bounce;
    
    public Plant()
    {
        bounce = 60;
    }
    
    public void act() 
    {
        
        World w = getWorld();
        
        if (this.getX() > (0 + bounce) &&
            this.getX() < (w.getWidth() - bounce) &&
            this.getY() > (0 + bounce) &&
            this.getY() < (w.getHeight() - bounce))
            {
                this.move(5);
            }
            else {
                this.turn(180);
                this.move(5);
            }
        
        // if(this.isAtEdge() == true) 
        // {
            // this.turn(40);
        // };
        // if(this.isTouching(java.lang.Class<null> cls))
        // {
            // this.turn(180);
        // }
    }
}


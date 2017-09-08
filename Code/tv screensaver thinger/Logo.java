import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Actor
{
    private int direction;
    private int stamp;
    
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Logo()
    {
        GreenfootImage image = getImage();
        image.scale(150, 100);
    }
    
    public void act() 
    {
        this.setRotation(direction);
        this.move(3);
        this.setRotation(0);
        stamp ++;
        if (this.isAtEdge()) 
        {
            this.direction = (direction + Greenfoot.getRandomNumber(95)) % 360;
            System.out.println(direction);
        }
        
        if (this.isTouching(Corners.class))
        {
            System.out.println("CORNER TOUCH");
            
        }
        
        if (stamp == 5) 
        {
            World w = this.getWorld();
            w.addObject(new DoesntMove(), getX(), getY());
            stamp = 0;
        }
    }    
}

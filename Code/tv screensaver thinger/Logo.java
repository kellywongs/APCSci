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
        this.move(4);
        this.setRotation(0);
        if (this.isAtEdge()) 
        {
            this.direction = direction + Greenfoot.getRandomNumber(45);
            System.out.println(direction);
        }
        
        if (this.isTouching(Corners.class))
        {
            System.out.println("CORNER TOUCH");
            
        }
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Bullet()
    {
        GreenfootImage image = getImage();
        image.scale(10, 10); 
        setImage(image);
    }
    
    public void act() 
    {
       setRotation(270);
       this.move(5);
       
       if (this.getY() == 0) 
       {
           World w = getWorld();
           w.removeObject(this);
        }
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int direction;
    int shootSpeed;
    int shootCounter;
    
    public Rocket()
    {
        this.setRotation(270);
        direction = 180;
        
        shootSpeed = 5;
        shootCounter = 0;
    }
    
    public void act() 
    {
        this.navigation();
        this.shoot();
    }    
    
    public void navigation()
    {
        if (Greenfoot.isKeyDown("left"))
        {  
            
            this.setRotation(180);
            this.move(3);
            this.setRotation(270);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {  
            
            this.setRotation(0);
            this.move(3);
            this.setRotation(270);
        }
        
    }
    
    public void shoot()
    {
        
        World w = getWorld();
        if (Greenfoot.isKeyDown("space"))
        {
            shootCounter += 1;
            System.out.println(shootCounter);
            
            if (shootCounter == shootSpeed) { 
                w.addObject(new Bullet(), getX(), getY());
                shootCounter = 0;
            }
        } 
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lawnmower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lawnmower extends Actor
{
    /**
     * Act - do whatever the Lawnmower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int speed;
    public int grassCount;
    
    public void act() 
    {
        
        this.move(speed);
        
        if (this.isAtEdge())
        {
                this.turn(180);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            speed+=1;
            System.out.println(speed/5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            speed-=1;
            System.out.println(speed/5);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            World w = this.getWorld();
            w.addObject(new SheepStamp(), getX(), getY());
        }
        
        if (this.isTouching(Grass.class))
        {
            removeTouching(Grass.class);
            System.out.println("grass killed: " + grassCount++);
        }
        
        if (this.isTouching(Rock.class))
        {
            this.setLocation(0,0);
            System.out.println("u dead");
        }
    }    
}

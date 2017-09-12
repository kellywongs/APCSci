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
    public int difficulty, moveSpeed;
    public int rotate;
    
    public int time, breadCount;
    
    public boolean leftIsDown, rightIsDown, upIsDown, downIsDown;
    
    public Snek()
    {
        GreenfootImage image = getImage();
        image.scale(25, 25);
        
        difficulty = 9;
        moveSpeed = 1;
        length = 5;
    }
    
    public void act() 
    {
        snekGame();
        breadCheck();
    }    
    
    public void breadCheck()
    {
        time ++;
        
        World w = this.getWorld();
        
        if (time >= (Greenfoot.getRandomNumber(50)+50) && breadCount == 0) 
        {
            w.addObject(new Bread(), Greenfoot.getRandomNumber(w.getWidth())+1, Greenfoot.getRandomNumber(w.getHeight())+1);
            time = 0;
            breadCount ++;
        }
        
        if (this.isTouching(Bread.class))
        {
            breadCount = 0;
            difficulty ++;
            length ++;
            System.out.println(length);
            
            if ((difficulty%10) == 0)
            {
                moveSpeed ++;
                lengthCounter=0;
            }
        }
    }
    
    public void snekGame()
    {
        World w = this.getWorld();
        lengthCounter ++;
        
        move(moveSpeed);
        
        if (lengthCounter == 18/moveSpeed)
        {
            w.addObject(new SnekTrail(), getX(), getY());
            lengthCounter = 0;
        }
         
        if (Greenfoot.isKeyDown("right"))
        {
            if (rightIsDown == false)
            {
                setRotation(0);
                rightIsDown = true;
            }
        } else 
        {
            rightIsDown = false;
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            if (upIsDown == false)
            {
                setRotation(270);
                upIsDown = true;
            }
        } else 
        {
            upIsDown = false;
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            if (leftIsDown == false)
            {
                setRotation(180);
                leftIsDown = true;
            }
        } else 
        {
            leftIsDown = false;
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            if (downIsDown == false)
            {
                setRotation(90);
                downIsDown = true;
            }
        } else 
        {
            downIsDown = false;
        }
    }
    
}

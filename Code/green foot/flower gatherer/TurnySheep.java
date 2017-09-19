import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TurnySheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TurnySheep extends Actor
{
    /**
     * Act - do whatever the TurnySheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int stepCounter;
    public int score;
    public int moveFor;
    public int size;
    public int speed;
    public int touchedBread;
    private int homeX, homeY;
    
    public TurnySheep()
    {
        stepCounter = 0;
        score = 0;
        touchedBread = 0;
        moveFor = Greenfoot.getRandomNumber(100)+1;
        
        GreenfootImage image = getImage();
        size = moveFor;
        image.scale(size+10, size);
        setImage(image);
    }
    
    public void critMove() 
    {
        
    }
    
    public void act() 
    {
        // if (stepCounter == 0)
        // {
            // homeX = getX();
            // homeY = getY();
            // stepCounter ++;
        // }
        
        // if (stepCounter <= moveFor)
        // {
            // this.move(5);
            // this.stepCounter ++;
            
            // if (this.isAtEdge())
            // {
                // this.turn(180);
            // }
        // } else 
        // {
            // this.moveFor = Greenfoot.getRandomNumber(100);
            // this.stepCounter = 1;
            // this.turn(40);
        // }
        
        stepCounter ++;
        this.move(speed/5);
        
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
        if (this.isAtEdge())
        {
            turn(180);
        }
        
        if (this.isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            System.out.println("You have killed "+score++ +" cacti."); 
            
            GreenfootImage image = getImage();
            
            if (size >= 300)
            {
                image.scale(size/2, size/3); 
                setImage(image);
                size = 1;
            } else {
                // size += Greenfoot.getRandomNumber(moveFor);
                image.scale(size+=5, size++); 
                setImage(image);
            }
           
        // }
        
        // if (this.isTouching(TurnySheep.class))
        // {
            // World w = getWorld();
            // w.addObject(new TurnySheep(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
        }
        
        if (this.isTouching(EvilFlower.class))
        {
            this.speed = 1;
        }
        
        if (this.isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            System.out.println("(DOOT DOOT DOOT DOOT DOOT) x" + touchedBread++); 
            
            GreenfootImage image = getImage();
            image.scale(50, 40); 
            setImage(image);
        }
        
        // if (touchedBread % 15 == 0)
        // {
            // this.setLocation(homeX, homeY);
        // }
    }    
}

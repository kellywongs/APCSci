import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int stepCounter;
    public int score;
    public int moveFor;
    public int size;
    public int touchedBread;
    
    public Sheep()
    {
        stepCounter = 0;
        score = 0;
        touchedBread = 0;
        moveFor = Greenfoot.getRandomNumber(100);
        
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
        if (stepCounter <= moveFor)
        {
            this.move(5);
            this.stepCounter ++;
            
            if (this.isAtEdge())
            {
                this.turn(180);
            }
        } else 
        {
            this.moveFor = Greenfoot.getRandomNumber(100);
            this.stepCounter = 0;
            this.turn(40);
        }
        
        if (this.isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            System.out.println("You have killed "+score++ +" cacti."); 
            
            GreenfootImage image = getImage();
            
            if (size >= 300)
            {
                image.scale(10, 15); 
                setImage(image);
                size = 1;
            } else {
                // size += Greenfoot.getRandomNumber(moveFor);
                image.scale(size++, size++); 
                setImage(image);
            }
           
        // }
        
        // if (this.isTouching(Sheep.class))
        // {
            // World w = getWorld();
            // w.addObject(new Sheep(), Greenfoot.getRandomNumber(w.getWidth()), Greenfoot.getRandomNumber(w.getHeight()));;
        }
        
        if (this.isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            System.out.println("(DOOT DOOT DOOT DOOT DOOT) x" + touchedBread++); 
            
            GreenfootImage image = getImage();
            image.scale(size*=2, size*=2); 
            setImage(image);
        }
    }    
}
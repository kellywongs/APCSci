import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SqBread extends Actor
{
    private int stepCounter;
    private int sidesLength;
    
    public SqBread() // constructor - make a new object
    {
        this.stepCounter = 0; // this. is just convention lmao
        this.sidesLength = 10;
    }
    
    /**
     * Act - do whatever the bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        stepCounter += 1;
        System.out.println(stepCounter);
        
        this.move(2);
        if(this.stepCounter == this.sidesLength) 
        {
            this.turn(10);
            this.stepCounter = 0;
        }
        if(this.isTouching(SqBread.class))
        {
            this.turn(180);
            while(this.isTouching(SqBread.class))
            {
                this.move(4);
            } 
        }
    }    
}

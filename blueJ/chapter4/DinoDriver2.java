import java.util.*;

/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    public static void main(String[] args)
    {
        ArrayList<Dinosaur> dinosaurList = new ArrayList<Dinosaur>(); 
        
        for (int i = 0; i < 30; i++)
        {
            double randomNumber = Math.random();
            if (randomNumber < (0.333)) { 
                dinosaurList.add(new TRex());
                randomAge(dinosaurList.get(i));
            }
            else if (randomNumber < (0.666)) { 
                dinosaurList.add(new Bronto());
                randomAge(dinosaurList.get(i));
            }
            else { 
                dinosaurList.add(new Stego()); 
                randomAge(dinosaurList.get(i));
            }
        }
        
        for (Dinosaur dinosaurs : dinosaurList)
        {
            System.out.println(dinosaurs.dinosaurString());
            // dinosaurs.toString();
        }
        
        battleTime(dinosaurList);
        
        }
        
    public static Dinosaur battleTime(ArrayList<Dinosaur> list)
    {
        Dinosaur winner = null;
        
        for (int fight = 0; fight < list.size(); fight++)
        {
            if (list.size() != 1) {
            while (list.get(fight).getHealth() > 0)
            {
                int defender = (int)(Math.random() * list.size());
                
                if (list.get(defender).equals(list.get(fight)) == false)
                {
                    if (list.get(defender).isAlive(list.get(defender)))
                    {
                        list.get(fight).attack(list.get(defender));
                        
                        if (list.get(defender).getHealth() <= 0)
                        {
                            list.remove(defender);
                        }
                    } else { defender = (int)(Math.random() * 30); }
                    
                    
                } else { defender = (int)(Math.random() * 30); }
                
            }
            
            if (list.get(fight).getHealth() <= 0)
            {
                list.remove(fight);
            }
        }
            
        }
        
        return winner;
    }
    
    public static Dinosaur fightEveryone(ArrayList<Dinosaur> population)
    {
        Dinosaur winner = null;
        
        for (int dinosaur = 0; dinosaur < population.size(); dinosaur+=1)
        {
            
        }
        
        return winner;
    }
        
    public static void randomAge(Dinosaur ager)
    {
        int randAge = (int)(Math.random()*34);
        
        for (int index = 0; index<randAge; index++)
        {
            ager.ageUp();
        }
    }
    
    public static void ageAll(ArrayList<Dinosaur> population) 
    {
        for (Dinosaur dino : population)
        {
            dino.ageUp();
            if (dino.getHealth() <= 0)
            {
                population.remove(dino);
            }
        }
    }
    
    public static void ageAll(ArrayList<Dinosaur> population, int years)
    {
        for (Dinosaur dino : population)
        {
            for (int times = 0; times < years; times ++)
            {
                dino.ageUp();
                if (dino.getHealth() <= 0)
                {
                    population.remove(dino);
                }
            }
        }
    }
    
}

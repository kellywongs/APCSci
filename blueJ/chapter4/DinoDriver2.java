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

        // for (Dinosaur dinosaurs : dinosaurList)
        // {
            // System.out.println(dinosaurs.dinosaurString());
            // // dinosaurs.toString();
        // }

        fightEveryone(dinosaurList, 12);

    }

    public static Dinosaur battleTime(ArrayList<Dinosaur> list)
    {
        Dinosaur winner = null;
        Dinosaur fighter = null;
        Dinosaur defender = null;
        
        ArrayList<Dinosaur> deadDinos = new ArrayList<Dinosaur>();
        for (int fight = 0; fight < list.size(); fight++)
        {
            fighter = list.get(fight);
            if (list.size() != 1) {
                while (fighter.getHealth() > 0)
                {
                    defender = list.get((int)(Math.random() * list.size()));

                    if (defender.equals(fighter) == false)
                    {
                        if (defender.isAlive(defender))
                        {
                            list.get(fight).attack(defender);

                            if (defender.getHealth() <= 0)
                            {
                                deadDinos.add(defender);
                                list.remove(defender);
                            }
                        } else { defender = list.get((int)(Math.random() * list.size())); }

                    } else { defender = list.get((int)(Math.random() * list.size())); }
                }
                if (fighter.getHealth() <= 0)
                {
                    deadDinos.add(fighter);
                }
            }

        }

        return winner;
    }

    public static void fightEveryone(ArrayList<Dinosaur> population, int years)
    {
        Dinosaur winner = population.get(0);
        Dinosaur fighter = null;
        for (int counter = 0; counter < years; counter++) {
            if (counter % 10 == 0)
            {
                for (int i = 0; i < 10; i++)
                {
                    double randomNumber = Math.random();
                    if (randomNumber < (0.333)) { 
                        population.add(new TRex());
                        randomAge(population.get(i));
                    }
                    else if (randomNumber < (0.666)) { 
                        population.add(new Bronto());
                        randomAge(population.get(i));
                    }
                    else { 
                        population.add(new Stego()); 
                        randomAge(population.get(i));
                    }
                }
            }
            
            for (int dinosaur = 0; dinosaur < population.size(); dinosaur+=1)
            {
                winner = population.get(dinosaur);
                
                do {
                    fighter = population.get((int)(Math.random())*population.size());
                } while (winner.equals(fighter) == false); 
                
                while (winner.getHealth() > 0) {
                winner.attack(fighter);
                
                if (fighter.getHealth() == 0) { population.remove(fighter); }
            }
                population.remove(winner);  
                
            }
        }

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

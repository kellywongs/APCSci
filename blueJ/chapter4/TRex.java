
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    public TRex() {
        this.setWeight(this.getWeight()+50);
        this.setType("t rex");
        
    }
    
    public boolean attack (Dinosaur other)
    { 
        int attackerStat = (int)((( this.getWeight() / 2 ) + this.getHealth() + 100) * this.calcFactor(other));
        int otherStat = (int)((other.getWeight() / 2) + other.getHealth() + 100);
        double underdogChance = Math.random(); 
        boolean won = false;
        
        System.out.println("\nattacker: " + attackerStat +
                           "\nattackee: " + otherStat);
        System.out.println("underdogChance: " + underdogChance);
                           
        if (underdogChance < 0.1 && (attackerStat < otherStat))
        {
            this.setHealth(this.getHealth() - (otherStat/40));
            other.setHealth(other.getHealth() - (attackerStat/8));
            
            System.out.println("underdog attacker won!");
            update(this, other);
            won = true;
        } else if (underdogChance < 0.1 && (otherStat < attackerStat))
        {
            this.setHealth(this.getHealth() - (otherStat/8));
            other.setHealth(other.getHealth() - (attackerStat/40));
            
            System.out.println("underdog attackee won!"); 
            update(other, this);
            won = false;
        } else if (attackerStat < otherStat)
        {
            this.setHealth(this.getHealth() - (otherStat/4));
            other.setHealth(other.getHealth() - (attackerStat/50));
            
            System.out.println("attackee won!");
            update(other, this);
            won = false;
        } else if (attackerStat > otherStat)
        {
            this.setHealth(this.getHealth() - (otherStat/50));
            other.setHealth(other.getHealth() - (attackerStat/4));
            
            System.out.println("attacker won!");
            update(this, other);
            won = true;
        } 
        System.out.println("\nattacker health: " + this.getHealth() +
                           "\nattackee health: " + other.getHealth());
        return won;
    }
    
    public double calcFactor (Dinosaur other)
    {
        double factor = 1;
        
        if (other.getType().equals("brontosaurus"))
        {
            factor = 1.3;
        } else if (other.getType().equals("stegosaurus"))
        {
            factor = 1.1;
        } 
        return factor;
    }
}

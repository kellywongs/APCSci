
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    public TRex() {
        weight += 50;
    }
    
    public boolean attack (Dinosaur other)
    { 
        int attackerStat = ( this.getWeight() / 2 ) + this.getHealth() + 100;
        int otherStat = (other.getWeight() / 2) + this.getHealth() + 100;
        double underdogChance = Math.random(); 
        boolean won = false;
        
        System.out.println("\nattacker: " + attackerStat +
                           "\nattackee: " + otherStat);
        System.out.println("underdogChance: " + underdogChance);
                           
        if (underdogChance == 0.1 && (attackerStat < otherStat))
        {
            this.setHealth(this.getHealth() - (otherStat/6));
            other.setHealth(other.getHealth() - (attackerStat/2));
            
            System.out.println("underdog attacker won!");
            won = true;
        } else if (underdogChance < 0.1 && (otherStat < attackerStat))
        {
            this.setHealth(this.getHealth() - (otherStat/2));
            other.setHealth(other.getHealth() - (attackerStat/6));
            
            System.out.println("underdog attackee won!"); 
            won = false;
        } else if (attackerStat < otherStat)
        {
            this.setHealth(this.getHealth() - (otherStat/2));
            other.setHealth(other.getHealth() - (attackerStat/8));
            
            System.out.println("attackee won!");
            won = false;
        } else if (attackerStat > otherStat)
        {
            this.setHealth(this.getHealth() - (otherStat/8));
            other.setHealth(other.getHealth() - (attackerStat/2));
            
            System.out.println("attacker won!");
            won = true;
        } 
        System.out.println("\nattacker health: " + this.getHealth() +
                           "\nattackee health: " + other.getHealth());
        return won;
    }
}

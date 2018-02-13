
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Dinosaur
{
    // instance variables
    private String name;
    private RandomName randomizerName = new RandomName();
    private int weight;
    private int age;
    private int health;
    private int wins;
    private int battles;
    private String gender;
    private String type;
    private String eating;
    
    public Dinosaur()
    {
        name = randomizerName.makeRandomName();
        weight = (int)(Math.random()*1000)/10;
        age = 0; // baby dino
        health = 75; //baby dinosaurs are easy to kill
        wins = 0;
        battles = 0;
        if (Math.random() > 0.5) { gender = "male"; }
                            else { gender = "female"; }
        type = "dinosaur";
        eating = "vore";
    }
    
    public Dinosaur(int weightE, int ageE, int healthE,
                    String genderE, String typeE, String eatingE)
    {
        weight = weightE;
        age = ageE;
        health = healthE;
        gender = genderE;
        type = typeE;
        eating = eatingE;
    }
    
    // ****************************************************************
    // getters n setters
    
    public String getName()  { return this.name; }
    public void setName(String newValue) { name = newValue; }
    
    public int getWeight()  { return this.weight; }
    public void setWeight(int newValue) { weight = newValue; }
    
    public int getAge()  { return this.age; }
    public void setAge(int newValue) { age = newValue; }
    
    public int getHealth()  { return this.health; }
    public void setHealth(int newValue) { health = newValue; }
    
    public int getWins()  { return this.wins; }
    public void setWins(int newValue) { wins = newValue; }
    
    public int getBattles()  { return this.battles; }
    public void setBattles(int newValue) { battles = newValue; }
    
    public String getGender()  { return this.gender; }
    public void setGender(String newValue) { gender = newValue; }
    
    public String getType()  { return this.type; }
    public void setType(String newValue) { type = newValue; }
    
    public String getEating()  { return this.eating; }
    public void setEating(String newValue) { eating = newValue; }
    
    public void ageUp() 
    {
        if (this.health > 0)
        {
            age ++;
            
            if (this.age < 10)
            {
                health += 10;
            } else if (this.age >= 10 && this.age < 25)
            {
                health = health;
            } else if (this.age >= 26 && this.age < 30)
            {
                health -= 5;
            } else if (this.age > 30)
            {
                health -=10; 
            }
        } 
    }
    
    
    public String dinosaurString()
    {   
        return ("\nname: " + name +
                "\nweight: " + weight + 
                "\tage: " + age +
                "\t        health: " + health +
                "\nwins: " + wins +
                "\t        losses: " + (battles-wins) +
                "\tbattles: " + battles +
                "\ngender: " + gender + 
                "\ttype: " + type +
                "\teating: " + eating);
    }
    
    public String toString()
    {   
        return ("\nname: " + name +
                "\nweight: " + weight + 
                "\tage: " + age +
                "\t        health: " + health +
                "\nwins: " + wins +
                "\t        losses: " + (battles-wins) +
                "\tbattles: " + battles +
                "\ngender: " + gender + 
                "\ttype: " + type +
                "\teating: " + eating);
    }
    
    public boolean attack (Dinosaur other)
    { 
        int attackerStat = (int)((( this.getWeight() / 2 ) + this.getHealth() + 100) * this.calcFactor(other));
        int otherStat = (int)((other.getWeight() / 2) + other.getHealth() + 100);
        double underdogChance = Math.random(); 
        boolean won = false;
        
        System.out.println("\nattacker: " + this.getName() + ", " + 
                            this.getType() + ", " + attackerStat +
                           "\nattackee: " + other.getName() + ", " + 
                            other.getType() + ", " + otherStat);
                           
        if (underdogChance < 0.1 && (attackerStat < otherStat))
        {
            this.setHealth(this.getHealth() - (otherStat/40));
            other.setHealth(other.getHealth() - (attackerStat/8));
            
            System.out.println("underdog " + this.getName() + " won!");
            update(this, other);
            won = true;
        } else if (underdogChance < 0.1 && (otherStat < attackerStat))
        {
            this.setHealth(this.getHealth() - (otherStat/8));
            other.setHealth(other.getHealth() - (attackerStat/40));
            
            System.out.println("underdog " + other.getName() + " won!"); 
            update(other, this);
            won = false;
        } else if (attackerStat < otherStat)
        {
            this.setHealth(this.getHealth() - (otherStat/4));
            other.setHealth(other.getHealth() - (attackerStat/50));
            
            System.out.println("attackee " + other.getName() + " won!");
            update(other, this);
            won = false;
        } else if (attackerStat > otherStat)
        {
            this.setHealth(this.getHealth() - (otherStat/50));
            other.setHealth(other.getHealth() - (attackerStat/4));
            
            System.out.println("attacker " + this.getName() + " won!");
            update(this, other);
            won = true;
        } 
        System.out.println("\n" + this.getName() + " health: " + this.getHealth() +
                           "\n" + other.getName() + " health: " + other.getHealth());
        return won;
    }
    
    public abstract double calcFactor(Dinosaur other);
    
    public void update(Dinosaur winner, Dinosaur loser)
    {
        winner.wins += 1;
        winner.battles += 1;
        
        loser.battles += 1;
    }
    
    public boolean isAlive(Dinosaur other)
    {
        boolean is = true;
        
        if (other.getHealth() != 0)
        {
            is = true;
        } else {
            is = false;
        }
        return is;
    }
}

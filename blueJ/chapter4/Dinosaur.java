
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Dinosaur
{
    // instance variables
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
    
    public int getWeight()  { return this.weight; }
    public void setWeight(int newValue) { weight = newValue; }
    
    public int getAge()  { return this.age; }
    public void setAge(int newValue) { age = newValue; }
    
    public int getHealth()  { return this.health; }
    public void setHealth(int newValue) { health = newValue; }
    
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
        return ("\nweight: " + weight + 
                "\nage: " + age +
                "\nhealth: " + health +
                "\nwins: " + wins +
                "\nlosses: " + (battles-wins) +
                "\nbattles: " + battles +
                "\ngender: " + gender + 
                "\ntype: " + type +
                "\neating: " + eating);
    }
    
    public abstract boolean attack(Dinosaur other);
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

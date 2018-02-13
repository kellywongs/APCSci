
/**
 * Write a description of class RandomName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomName
{
    public String makeRandomName()
    {
        String name = "";
        
        name += randomConsonant().toUpperCase();
        name += randomVowel();
        if (Math.random()>0.5){
            name += randomConsonant();
        } else {
             name +=randomVowel();
             name += randomConsonant();
        }
        if (Math.random()>0.5){
            name += randomConsonant();
        } else {
             name +=randomVowel();
        }
        if (Math.random()>0.3){
            name += randomConsonant();
        } else if (Math.random() > 0.6) {
             name +=randomVowel();
        }
        
        return name;
    }
    
    private String randomConsonant()
    {
        String[] consonantList = {"b", "c", "d", "f", "g", "h", "j", "k", "l", 
            "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        return(consonantList[(int)(Math.random() * consonantList.length)]);
    }
    
    private String randomVowel()
    {
        String[] vowelList = {"a", "e", "i", "o", "u", "y"};
        return(vowelList[(int)(Math.random() * vowelList.length)]);
    }
}

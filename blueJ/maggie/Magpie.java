import java.util.*;

/**
 * Write a description of class Magpie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magpie
{
    
    public String greeting() 
    {
        return(sayHi() + invitationToTalk());
    }
    
    /* the actual conversation engine */
    
    public String conversation(String statement)
    {
        String response = "";
        statement = statement.toLowerCase();
        
        if (mentionsAffirmative(statement) &&
            mentionsTalking(statement))
        {
            response = howGoesIt();
        }
        
       // if (mentionsSelf(statement) && mentionsWellbeing(statement))
       // {
       //    response = reciprocateWellness();
       // }
            
        return response;
    }
    
    /* responses */
    
    private String sayHi()
    {
        String[] list = 
            {"Hi! ", "Hello! ", "Salutations! ", "Greetings! ", "Nice day out! "};
        
        return(list[(int)(Math.random()*list.length)]);
    }
    
    private String invitationToTalk()
    {
        String[] list = 
            {"Wanna talk? ", "Let's talk. ", "Wanna chat? ", "Let's chat. ", 
             "Let's talk about things. ", "What's going on? ", "How are you doing? ",
             " "};
        
        return(list[(int)(Math.random()*list.length)]);
    }
    
    private String howGoesIt()
    {
        String[] list = 
            {"How are you doing? ", "What's been going on? ", "How are you? ",
             "What's happening? "};
             
        return(list[(int)(Math.random()*list.length)]);
    }
    
    /* check if statement mentions things in arrays down here */
    
    private boolean mentions(String statement, String list)
    {
        int arrayCounter = 0;
        boolean statementContains = false;
        
        while (arrayCOunter != statement.length()+1)
        {
            if (statement.contains(list[arrayCOunter]))
            {
                statementContains = true;
                break;
            }
            arrayCounter ++;
        }
        
        return statementContains;
    }
    
    private boolean mentionsAffirmative(String statement)
    {
        String[] list = {"yeah", "ye ", " ye", "yes", "sure", "okay" "ok", "course"};
        return statement.mentions(statement, list); // TODO: possibly put "statement, list" on every single calling of mentions()
    }
    
    private boolean mentionsTalking(String statement)
    {
        String[] list = {"talk", "chat", "speak"};
        return statement.mentions();
    }
    
    private boolean mentionsSelf(String statement)
    {
        String[] list = {"me", "i ", "my", "self"};
        return statement.mentions();
    }
    
    private boolean mentionsWellbeing(String statement)
    {
        String[] list = {"good", "well", "great", "snazzy", "ok"} //TODO: "just ok?"
        return statement.mentions();
    }
    
    private boolean mentionsNegative(String statement)
    {
        String[] list = {"not", "never", "no", "nah"}
        return statement.mentions();
    }
}

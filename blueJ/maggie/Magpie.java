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
        return(sayHi() + " " + invitationToTalk());
    }
    
    public String conversation(String statement)
    {
        String response = "";
        
        
        String[] talking = {"talk", "chat"};
        
        if (mentionsAffirmative(statement) &&
            mentionsTalking(statement))
        {
            response = howGoesIt();
            System.out.println("this workds");
        }
            
        return response;
    }
    
    private String sayHi()
    {
        String[] sayHiList = 
            {"Hi!", "Hello!", "Salutations!", "Greetings!", "Nice day out!"};
        
        return(sayHiList[(int)(Math.random()*sayHiList.length)]);
    }
    
    private String invitationToTalk()
    {
        String[] invitationToTalkList = 
            {"Wanna talk?", "Let's talk.", "Wanna chat?", "Let's chat.", 
             "Let's talk about things.", "What's going on?", "How are you doing?",
             ""};
        
        return(invitationToTalkList[(int)(Math.random()*invitationToTalkList.length)]);
    }
    
    private boolean mentionsAffirmative(String statement)
    {
        String[] affirmativeList = {"yeah", "ye"};
        int arrayCounter = 0;
        boolean statementContains = false;
        
        while (arrayCounter != statement.length()+1)
        {
            if (statement.contains(affirmativeList[arrayCounter]))
            {
                statementContains = true;
                break;
            }
            arrayCounter ++;
        }
        
        return statementContains;
    }
    
    private boolean mentionsTalking(String statement)
    {
        String[] talkingList = {"talk", "chat"};
        int arrayCounter = 0;
        boolean statementContains = false;
        
        while (arrayCounter != statement.length()+1)
        {
            if (statement.contains(talkingList[arrayCounter]))
            {
                statementContains = true;
                break;
            }
            arrayCounter ++;
        }
        
        return statementContains;
    }
    
    private String howGoesIt()
    {
        String[] howGoesItList = 
            {"How are you doing?", "What's been going on?", "How are you?",
             "What's happening?"};
             
        return(howGoesItList[(int)(Math.random()*howGoesItList.length)]);
    }
    
    
}

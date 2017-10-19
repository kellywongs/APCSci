import java.util.Arrays;

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
        
        String[] affirmative =
            {"yes ", "ye ", "yeah ", "sure ", "ok "};
        
            
        
        if (affirmative.contains(statement.toLowerCase()) && 
            talking.contains(statement.toLowerCase()))
        {
            response = howGoesIt();
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
            {"Wanna talk?", "Let's talk.", "Wanna chat?", "Let's chat.", ""};
        
        return(invitationToTalkList[(int)(Math.random()*invitationToTalkList.length)]);
    }
    
    private String howGoesIt()
    {
        String[] howGoesItList = 
            {"How are you doing?", "What's been going on?", "How are you?",
             "What's happening?"};
             
        return(howGoesItList[(int)(Math.random()*howGoesItList.length)]);
    }
    
    
}

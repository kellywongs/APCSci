import java.util.*;


public class MagpieTwo
{
    public String greeting() 
    {
        return(sayHi() + invitationToTalk());
    }
    
    public String conversation(String input)
    {
        String response = "";
        
        return response;
    }
    
    private String invitationToTalk()
    {
        String[] list = 
            {"Wanna talk?", "Let's talk.", "Wanna chat?", "Let's chat.", 
                "Let's talk about things.", "What's going on?", "How are you doing?",
                ""};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String sayHi()
    {
        String[] list = 
            {"Hi!", "Hello!", "Salutations!", "Greetings!", "Nice day out!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
}

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

        if ((mentionsAffirmative(statement) || mentionsGreeting(statement)) &&
            mentionsTalking(statement))
        {
            response = howGoesIt();
        }

        if (mentionsSelf(statement) && 
            mentionsWellbeing(statement))
        {
            if (mentionsNegative(statement)) 
            {
                response = expressSympathy() + why();
            } else {
                response = reciprocate() + wellness();
            }
        }
        
        if (mentionsHow(statement) &&
            isQuestion(statement))
        {
            response = wellness();
        }

        return response;
    }

    /* responses */

    private String sayHi()
    {
        String[] list = 
            {"Hi!", "Hello!", "Salutations!", "Greetings!", "Nice day out!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }

    private String invitationToTalk()
    {
        String[] list = 
            {"Wanna talk?", "Let's talk.", "Wanna chat?", "Let's chat.", 
                "Let's talk about things.", "What's going on?", "How are you doing?",
                ""};

        return(list[(int)(Math.random()*list.length)] + " ");
    }

    private String howGoesIt()
    {
        String[] list = 
            {"How are you doing?", "What's been going on?", "How are you?",
                "What's happening?"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String expressSympathy()
    {
        String[] list = 
            {"Oh no!", "Oh dear.", "I'm sorry.", "Uh oh!", "Jeez, that sucks,",
            "What!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String why()
    {
        String[] list = {"What for?", "Why?", "Why is that?", "Any reasons why?",
            "What's happened?"};
            
        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String reciprocate()
    {
        String[] list = 
            {"Me too,", "Same,", "Same here!", "Hey, same!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }

    private String wellness()
    {
        String[] list = 
            {"I'm doing good as well.", "I'm feeling good!", 
                "It's a nice day, I'm feeling good!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }

    /* check if statement mentions things in arrays down here */
    private boolean mentionsAffirmative(String statement)
    {
        String[] list = {"yeah", "ye ", " ye", "yes", "sure", 
                "okay", "ok", "course"};
        return mentions(statement, list); 
    }

    private boolean mentionsGreeting(String statement)
    {
        String[] list = {"hi", "hello", "yo ", "yello ", "sup", "hey",
                "wassup", "what's good", "salutations"};
        return mentions(statement, list); 
    }

    private boolean mentionsTalking(String statement)
    {
        String[] list = {"talk", "chat", "speak"};
        return mentions(statement, list);
    }

    private boolean mentionsSelf(String statement)
    {
        String[] list = {"me", "i ", "my", "self", "i'm",};
        return mentions(statement, list);
    }

    private boolean mentionsWellbeing(String statement)
    {
        String[] list = {"good", "well", "great", "snazzy", "ok",
            "hot",}; //TODO: "just ok?"
        return mentions(statement, list);
    }

    private boolean mentionsNegative(String statement)
    {
        String[] list = {"not", "never", "no", "nah"};
        return mentions(statement, list);
    }

    private boolean mentionsModifier(String statement)
    {
        String[] list = {"really", "very", "super", "extremely", "v ",
                " af", "real", "so "};
        return mentions(statement, list);
    }
    
    private boolean mentionsMagpie(String statement)
    {
        String[] list = {"you", " u ", "magpie", "maggie"};
        return mentions(statement, list);
    }
    
    private boolean mentionsHow(String statement)
    {
        String[] list = {"how",};
        return mentions(statement, list);
    }
    
    private boolean isQuestion(String statement)
    {
        String[] list = {"?"};
        return mentions(statement, list);
    }

    private boolean mentions(String statement, String[] list)
    {
        int arrayCounter = 0;
        boolean statementContains = false;

        while (arrayCounter != list.length)
        {
            if (statement.contains(list[arrayCounter]))
            {
                statementContains = true;
                break;
            }
            arrayCounter ++;
        }

        return statementContains;
    }
}

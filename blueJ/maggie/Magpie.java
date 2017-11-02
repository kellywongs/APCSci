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

    public String conversation(String input)
    {
        String response = "";
        input = input.toLowerCase();
        String[] statement = input.split(" "); ;
        int wordCounter = 0;

        if (mentionsAffirmative(statement[wordCounter]) || mentionsGreeting(statement[wordCounter]))
        {
            System.out.println("affirmative, greeting");
            response += howGoesIt();
        }
        
        if (mentionsNegative(statement[wordCounter]))
        {
            System.out.println("negative");
            response += expressSympathy() + why();
        }

        if (mentionsSelf(statement[wordCounter]) && 
            mentionsGoodAdj(statement[wordCounter]))
        {
            if (mentionsNegative(statement[wordCounter])) 
            {
                if (mentionsModifier(statement[wordCounter]))
                {
                    System.out.println("negative > modifier");
                    response += expressSympathy();
                }
                response += why();
            } else {
                System.out.println("self + good adj");
                response += reciprocate() + wellness();
            }
        } else if (mentionsSelf(statement[wordCounter]) &&
                   mentionsBadAdj(statement[wordCounter])) 
        {
            if (mentionsModifier(statement[wordCounter]))
            {
                System.out.println("self + bad adj > modifier");
                response += expressSympathy();
            }
            System.out.println("self + bad adj");
            response += why();
        }
        
        if (mentionsHow(statement[wordCounter]) &&
            mentionsMagpie(statement[wordCounter]))
        {
            System.out.println("how + magpie");
            response += wellness() + thank() + "for asking!";
        }
        
        if (mentionsJoke(statement[wordCounter]))
        {
           System.out.println("joke");
           response += joke();
        }
        
        /* at the very end if nothing matches */
        
        if (response.equals(""))
        {
            response += cannotParse();
        }

        return response;
    }

    /* responses */
    
    private String cannotParse()
    {
        String[] list = 
            {"I'm sorry, I can't understand that.", 
             "I don't understand what you mean.",
             "I would give you a noncommital response, but unfortunately I don't know what you said.",
             "Can you repeat that?",
             "I haven't been trained to respond to that, I'm sorry!",
             "I'm not sure what you said.",
             "Guess that means I gotta study harder to pass the Turing test!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String expressSympathy()
    {
        String[] list = 
            {"Oh no!", "Oh dear.", "I'm sorry.", "Uh oh!", "Jeez, that sucks.",
            "What!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String howGoesIt()
    {
        String[] list = 
            {"How are you doing?", "What's been going on?", "How are you?",
                "What's happening?"};

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
    
    private String joke()
    {
        String[] list = 
            {"If I told you a joke in my language, I'd have to explain it.",
             "The past, the future, and the present walk into a bar. \n It was tense.",
             "What do you call a Frenchman wearing sandals? \n Philippe Philoppe.",};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String reciprocate()
    {
        String[] list = 
            {"Me too,", "Same,", "Same here!", "Hey, same!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }

    private String sayHi()
    {
        String[] list = 
            {"Hi!", "Hello!", "Salutations!", "Greetings!", "Nice day out!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String thank()
    {
        String[] list = 
            {"Thanks", "Thanks a lot", "Thank",};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String wellness()
    {
        String[] list = 
            {"I'm doing good.", "I'm feeling good!", 
                "It's a nice day, I'm feeling good!",
                "I got a lot of sleep last night so I'm feeling good.",
                "I'm actually doing really well!"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String why()
    {
        String[] list = {"What for?", "Why?", "Why is that?", "Any reasons why?",
            "What's happened?"};
            
        return(list[(int)(Math.random()*list.length)] + " ");
    }
    
    private String yes()
    {
        String[] list = 
            {"Yeah", "Sure", "Definitely", "Oh yes", "God yes", "Ye"};

        return(list[(int)(Math.random()*list.length)] + " ");
    }

    /* check if statement[wordCounter] mentions things in arrays down here */
    private boolean mentionsAffirmative(String statement)
    {
        String[] list = {"yeah", "ye ", " ye", "yes", "sure", 
                "okay", "ok\n", "ok ", "course"};
        return mentions(statement, list); 
    }
    
    private boolean mentionsBadAdj(String statement)
    {
        String[] list = {"bad", "horr", "terr", "disgust"}; 
        return mentions(statement, list);
    }

    private boolean mentionsGoodAdj(String statement)
    {
        String[] list = {"good", "well", "great", "snazzy", "ok\n", "ok ",
            "hot",}; //TODO: "just ok?"
        return mentions(statement, list); 
    }
    
    
    private boolean mentionsGreeting(String statement)
    {
        String[] list = {"hi", "hello", "yo ", "yello ", "sup", "hey",
                "wassup", "what's good", "salutations"};
        return mentions(statement, list);  
    }
    
    private boolean mentionsHow(String statement)
    {
        String[] list = {"how",};
        return mentions(statement, list); 
    }
    
    private boolean mentionsJoke(String statement)
    {
        String[] list = {"joke",};
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
        String[] list = {"you", "ur", "u ", " u", "mag"};
        return mentions(statement, list); 
    }

    private boolean mentionsSelf(String statement)
    {
        String[] list = {"me", "i ", "my", "self", "i'm",};
        return mentions(statement, list); 
    }
    
    private boolean mentionsTalking(String statement)
    {
        String[] list = {"talk", "chat", "speak"};
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
        String keyMatcher = "";

        while (arrayCounter != list.length)
        {
            if (statement.contains(list[arrayCounter]))
            {
                statementContains = true;
                keyMatcher = list[arrayCounter];
                break;
            }
            arrayCounter ++;
        }
        return statementContains;
    }
}

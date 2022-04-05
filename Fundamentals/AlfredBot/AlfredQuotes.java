import java.util.Date; //Importing the java function to pull the computers date + time.
public class AlfredQuotes {// Assigning a class
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, good to see you Master Wayne.";
    }
    
    public String guestGreeting(String name) {//Creating a method with the type of string and name of basicGreeting and a parameter type of string.
        // YOUR CODE HERE
        String greeting = String.format("Welcome home %s", name);
        return greeting;
    }
    public String guestGreeting(String name, String dayPeriod){
        String greeting = String.format("%s %s", dayPeriod, name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Todays date is, " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > - 1){
            return "Right away, sir. She certainly isn't sophisticated enough for that."; 
        }
        if(conversation.indexOf("Alfred") > - 1){
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }

    public String toLoudAlfred(String action){
        String yelling = action;
        return yelling.toUpperCase();
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


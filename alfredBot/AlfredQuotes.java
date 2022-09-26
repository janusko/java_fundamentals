import java.util.Date;
import java.util.Random;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Welcome to Wayne Manner " + name;
    }

    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + " " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Urgent announcement! Today's date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // listeners:
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        String answer;
        if (a >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (b <= 0) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public Integer randomNumber() {
        int number = (int)(Math.random() * 10) + 0;
        return number;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


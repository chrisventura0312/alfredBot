import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s. Lovely to see you.", name);
    }
    // guestGreeting(String name) method above now overloaded
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(sdf.format(date));
        
        String dayPeriod;
        if (hour >= 0 && hour < 12) {
            dayPeriod = "morning";
            } else if (hour >= 12 && hour < 18) {
                dayPeriod = "afternoon";
            } else {
                dayPeriod = "evening";
            }
        
            return String.format("Good %s. Lovely to see you.", dayPeriod);
        }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


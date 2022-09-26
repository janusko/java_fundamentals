public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 6;
        double dripPrice = 5;
        double lattePrice = 5;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(isReadyOrder1? customer1 + readyMessage : customer1 + pendingMessage);
        System.out.println(isReadyOrder4? customer4 + readyMessage : customer4 + pendingMessage);
        System.out.println(isReadyOrder2? customer2 + readyMessage + ". " + displayTotalMessage + lattePrice * 2: customer2 + pendingMessage);
        System.out.println(customer2 + displayTotalMessage + (lattePrice - mochaPrice));
        
    	// ** Your customer interaction print statements will go here ** //
    }
}

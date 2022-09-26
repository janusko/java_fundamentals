import java.util.ArrayList;

public class CafeUtil {


    public int getStreakGoal(int numOfWeeks) {
        int sum = 0;
        for(int i = 0; i < numOfWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.println(menuItems.indexOf(item) + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello" + " " + userName);
        System.out.println("There are " + customers.size() + " " + "ahead of you.");
        customers.add(userName);
    }

    void printPriceChart(String product, double price, int maxQuantity) {;
        for(int i = 1; i < maxQuantity; i++) {
            System.out.println(i <= 1 ? i + " $" + (i * price) : i + " $" + ((price * i - (0.5 * (i - 1)) )));
        }
    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        } else {
            for(int i = 0; i < menuItems.size(); i ++) {
                System.out.println(i + " " + menuItems.get(i) + " " + prices.get(i));
            }
            return true;
        }
    }
}


import java.util.ArrayList;
public class CafeUtil{
    public int getStreakGoal(){
        int num = 10;
        int sum = 0;
        for(int i = 0; i<=num; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for(int i = 0; i<lineItems.length; i++){
            sum = sum + lineItems[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String>menu){
        for(int i = 0; i < menu.size(); i++){
            System.out.println((i) + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + ". There are " + customers.size() + " people ahead of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}

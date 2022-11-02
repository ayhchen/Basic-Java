public class ShoppingMall{
    
    /* Hello! I am Yu-Hsin (Alex) Chen. A fun fact about me is that I do not sleep with pillows at night :)
    */

    public static void main(String args[]){
        String name = "Oswald";
        int cash = 100;
        double taxRate = 0.13;
        double subtotal = 58.62;
        double change = cash - (subtotal + (subtotal * taxRate)); 
        change = change * 100;
        change = (int) change;
        change = change / 100; 
        System.out.println(name + " has $" + change + " dollars remaining!\n" + name + " started with $" + cash + " dollars!");
    }
}
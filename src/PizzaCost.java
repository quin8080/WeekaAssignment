
import java.util.Scanner;


public class PizzaCost {

    
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
         int size, top;
         double bc = 1.5, tc, tcot,sc;
         System.out.println("What size of pizza would you like");
         size= s.nextInt();
         System.out.println("How many toppings would you like ;) ");
         top= s.nextInt();
         sc= size * 0.5;
         tcot = top*0.75;
         tc= bc+ sc+ tcot;
         System.out.format("You pizze will be $%.2f",tc);
         
    
     
    
    }
    
}

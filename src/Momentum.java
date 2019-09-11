
import java.util.Scanner;
public class Momentum {

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double mass, vel, mom;
        System.out.println("Enter a number for the mass ");
       mass = s.nextDouble();
        System.out.format("Enter the number for velocity ");
        vel = s.nextDouble();
        mom = mass*vel;
        System.out.println("The momentum of the object is " + mom+ " kg-m/s ");
    }
    
}

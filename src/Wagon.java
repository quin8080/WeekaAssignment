
import hsa.Console;
import java.awt.Color;


public class Wagon {

   
    public static void main(String[] args) {
        Console c = new Console();
        c.setColor(Color.CYAN);
        c.fillRect(0, 0, 2000, 400);
        c.setColor(Color.green);
        c.fillRect(0, 400, 2000, 200);
        c.setColor(Color.RED);
        c.fillRect(150, 310, 400, 100);
        c.setColor(Color.BLACK);
        c.fillOval(200,400 , 50, 50);
        c.fillOval(450,400,50,50);
        c.setColor(Color.yellow);
        c.fillOval(520, 30, 100, 100);
        c.setColor(Color.black);
       c.drawLine(30, 200, 150, 310);
        
        
        
    }
    
}

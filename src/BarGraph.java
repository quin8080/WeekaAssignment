
import hsa.Console;
import java.awt.Color;



public class BarGraph {

   
    public static void main(String[] args) {
        Console c = new Console();
        int h1, h2, h3, h4;
        c.print("enter height of bar 1> ");
        h1= c.readInt();
        c.print("Enter the height of bar2> ");
        h2= c.readInt();
        c.print("enter the gieght of bar 3> ");
        h3= c.readInt();
        c.print("enter the height of bar 4> ");
        h4= c.readInt();
      
        
        c.setColor(Color.RED);
        c.fillRect(100, 500-h1, 50, h1);
        c.drawString("Value" + h1, 100, 500-h1-20);
        
        c.setColor(Color.BLUE);
        c.fillRect(200, 500-h2, 50, h2);
        c.drawString("Value" + h2, 200, 500-h2-20);
        
        c.setColor(Color.YELLOW);
        c.fillRect(300, 500-h3, 50, h3);
        c.drawString("Value" + h3, 300, 500-h3-20);
        
        c.setColor(Color.BLACK);
        c.fillRect(400, 500-h4, 50, h4);
        c.drawString("Value" + h4, 400, 500-h4-20);
        
    }
    
}

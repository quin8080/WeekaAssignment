
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.SketchPadWindow;
import java.awt.Color;
import java.until.Scanner;


public class BarGPen {

 
    public static void main(String[] args) {
        Pen p = new StandardPen (new SketchPadWindow(640,480));
        PenBar po1 = new PenBar();
        PenBar po2 = new PenBar();
        PenBar po3 = new PenBar();
        PenBar po4 = new PenBar();
        
        po1.draw(p,100,200,Color.blue);
        
    }
    
}

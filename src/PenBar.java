import TurtleGraphics.Pen;
import java.awt.Color;
public class PenBar {
 int x, y, hieght;
 Color bco;
 
 
 public void mole(Pen p, int x, int y, Color s){
    p.setColor(s);
    p.up();
    p.move(x, y);
    p.down();
    p.setWidth(50);
    p.setColor(bco);
    p.setDirection(0);
    p.move(hieght);
    p.up();
    p.move(35);
    p.drawString("Value :" + hieght);
    
    
    
}

    void draw(Pen p, int i, int i0, Color blue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}

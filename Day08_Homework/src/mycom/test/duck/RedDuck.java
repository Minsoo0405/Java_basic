package mycom.test.duck;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.awt.*;

public class RedDuck extends Duck implements Cryable, Flyable {
    public RedDuck() {
        //super
    }
    public RedDuck(int x, int y) {
        super(x,y);
    }
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
    public void fly(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("날다", x-15, y+Duck.DUCK_SIZE+5);
    }
    public void cry(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("꽥꽥",x+Duck.DUCK_SIZE-10, y);
    }
}

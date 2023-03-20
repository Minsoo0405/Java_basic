package mycom.mytest.duck;

import java.awt.*;

public class RubberDuck extends Duck implements Cryable {
    public RubberDuck() {

    }
    public RubberDuck(int x, int y) {
        super(x,y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x,y,Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
    @Override
    public void cry(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("꽥꽥",x+Duck.DUCK_SIZE+2, y);
    }
}

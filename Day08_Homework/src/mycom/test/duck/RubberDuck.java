package mycom.test.duck;

import java.awt.*;

public class RubberDuck extends Duck implements Cryable {
    public RubberDuck() {
        //super();
    }
    public RubberDuck(int x, int y) {
        super(x,y);
    }
    public void display(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x,y,Duck.DUCK_SIZE, Duck.DUCK_SIZE);
        //g.set(Color.Red);
    }

    @Override
    public void cry(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("삑삑", x+Duck.DUCK_SIZE-10, y);
    }
}

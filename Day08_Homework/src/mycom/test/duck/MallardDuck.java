package mycom.test.duck;

import java.awt.*;

public class MallardDuck extends Duck implements Flyable, Cryable {
    public MallardDuck() {
        //super();
    }
    public MallardDuck(int x, int y) {
        super(x,y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

    @Override
    public void fly(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("날다", x-15, y+Duck.DUCK_SIZE+5);

    }

    @Override
    public void cry(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("꽥꽥", x+Duck.DUCK_SIZE-10, y);
    }
};

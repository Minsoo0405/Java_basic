package mycom.mytest.duck;

import java.awt.*;

public class RedDuck extends Duck implements Cryable,Flyable{
    public RedDuck() {

    }
    public RedDuck(int x, int y) {
        super(x,y);
    }
    @Override
    public void fly(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("날다",x,y+DUCK_SIZE+2);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x,y,Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
    @Override
    public void cry(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("꽥꽥",x+Duck.DUCK_SIZE+2, y);
    }
}

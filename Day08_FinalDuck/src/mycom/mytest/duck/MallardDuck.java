package mycom.mytest.duck;

import java.awt.*;

public class MallardDuck extends Duck implements Flyable, Cryable{
    public MallardDuck() {

    }
    public MallardDuck(int x, int y) {
        super(x,y);
    };
    @Override
    public void fly(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("날다",x,y+DUCK_SIZE+2);
    };
    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x,y,Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    };
    @Override
    public void cry(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("꽥꽥",x+Duck.DUCK_SIZE+2, y);
    };
};

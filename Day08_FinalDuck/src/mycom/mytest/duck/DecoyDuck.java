package mycom.mytest.duck;

import java.awt.*;

public class DecoyDuck extends Duck{
    public DecoyDuck() {

    }
    public DecoyDuck(int x, int y) {
        super(x, y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
package mycom.mytest;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MyShape {
    protected int x;
    protected int y;
    public static final int SHAPE_SIZE=50;

    public MyShape() {
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT-100)+50;
    }

    public MyShape(int mx, int my) {
        this.x = mx;
        this.y = my;
    }

    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
    }
}

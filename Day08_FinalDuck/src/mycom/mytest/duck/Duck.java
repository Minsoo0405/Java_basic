package mycom.mytest.duck;

import java.awt.*;
import java.util.Random;

public class Duck {
    protected int x;
    protected int y;
    public static final int DUCK_SIZE = 30;

    //Method's Overloading
    public Duck() {
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //0~799
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70; //0~599
    }
    public Duck(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void swim(Graphics g) {
        g.drawString("수영", x, y-2);
    }
    public void display(Graphics g) {
    }
}

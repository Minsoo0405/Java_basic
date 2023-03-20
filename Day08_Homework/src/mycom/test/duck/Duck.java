package mycom.test.duck;

import java.awt.*;
import java.util.Random;

public abstract class Duck {
    protected int x;
    protected int y;
    public static final int DUCK_SIZE = 50;

    //Method's Overloading
    public Duck() {
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
    }

    public Duck(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void swim(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("수영",x-15,y);
    }

    public abstract void display(Graphics g);

};
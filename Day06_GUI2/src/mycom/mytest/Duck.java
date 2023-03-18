package mycom.mytest;

import java.util.Random;

public class Duck {
    protected int x;
    protected int y;

    public Duck() {
        Random rnd = new Random();
        x = rnd.nextInt(800);
        y = rnd.nextInt(600);
    }
    public Duck(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println(x+","+y);
    }
}

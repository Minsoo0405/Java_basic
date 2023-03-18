package mycom.mytest;

import java.util.Random;
import java.util.SplittableRandom;

public class Duck {
    private int x;
    private int y;
    protected String myShape = "Duck";

    public Duck() {
        Random rnd = new Random();
        x = rnd.nextInt(800);
        y = rnd.nextInt(600);
    }
    public Duck(int x, int y) {
        // 유효성 검사
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println(x+","+y+"="+myShape);
    }

    public void quack() {
        System.out.println("꽥꽥");
    }
};

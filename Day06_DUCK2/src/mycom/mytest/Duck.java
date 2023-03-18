package mycom.mytest;

import java.util.Random;

public abstract class Duck {

    protected int x;
    protected int y;
    protected String myShape="Duck";

    public Duck() {
        Random rnd = new Random();
        x = rnd.nextInt(800);
        y = rnd.nextInt(600);
    }
    // Overloading
    public Duck(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 추상메소드(abstract method <-> 구체적(실체적))
    public abstract void display() ;

    public void quack() {
        System.out.println("꽥꽥");
    }
}

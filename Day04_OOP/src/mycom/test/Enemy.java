package mycom.test;

import java.util.Random;

public class Enemy {
    //속성
    private int x;
    private int y;
    private String myShape="Enemy";

    public Enemy() {
        //constructor = 생성자 : 속성을 초기화
        Random rnd = new Random();
        x = rnd.nextInt(600); //0~599
        y = rnd.nextInt(400); //0~399
    }
    //메소드
    public void display() {
        System.out.println("x="+x+",y="+y+":"+myShape);
    }
    public void moveTop() {
        y=y+1;
        display();
    }
    public void moveBottom() {
        y=y-1;
        display();
    }
    public void moveLeft() {
        x=x-1;
        display();
    }
    public void moveRight() {
        x=x+1;
        display();
    }// class Enemy
}

package mycom.test;

import java.util.Random;
public class Player {
    //속성
    private int x;
    private int y;
    private String myShape="Player";

    public Player() {
        //constructor = 생성자 : 속성을 초기화
        Random rnd = new Random();
        x = rnd.nextInt(800); //0~799
        y = rnd.nextInt(600); //0~599
    }
    //메소드
    public void display() {
        System.out.println("x="+x+",y="+y+":"+myShape);
    }
    public void moveLeft() {
        x=x-1;
        display();
    }
    public void moveRight() {
        x=x+1;
        display();
    }
}

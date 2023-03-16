package mycom.mytest;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 창 Frame 클래스 생성
        Frame f = new Frame();

        // Color 클래스 생성
        // Color bgcolor = new Color(5,0,0);
        // f.setBackground(bgcolor);

        // Button 클래스 생성
        Button  btn = new Button("로그인");
        f.lay
        f.add(btn);
        f.setSize(800, 600);
        f.setBackground(Color.getHSBColor(195,200,234));
        f.setVisible(true);
    }
}

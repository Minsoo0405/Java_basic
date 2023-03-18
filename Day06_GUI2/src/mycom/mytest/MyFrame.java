package mycom.mytest;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame() {
        super();    //Frame f = new Frame();
        this.setSize(800,600);  //f.setSize();
        this.setVisible(true); //독점권 요청 --> OS --> 독점권 뺏어서 다시 부여 --> paint(g)
    }

    @Override
    public void paint(Graphics g) {
        Duck d = new Duck();
        d.display();
    }
}

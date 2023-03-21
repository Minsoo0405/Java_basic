package mycom.mytest;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class MyFrame extends Frame{
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    ArrayList<MyShape> arr = new ArrayList<MyShape>();

    public MyFrame() {
        super("이벤트 프로그램");
        //이벤트 처리기를 등록
        this.addMouseListener(new MyHandler());
        //창 닫기를 등록
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) //WindowAdapter class Overriding
            {
                System.exit(0); //프로그램 종료 하기
            }
        });
        this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
        this.setVisible(true);
    }//MyFrame
    @Override
    public void paint(Graphics g) {
        for(MyShape s:arr) {
            s.display(g);
        }
    };

    //User 마우스 클릭이 일어날때 그리기 동작이 수행
    //클릭에 대한 Listener
    class MyHandler implements MouseListener {

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("x="+e.getX()+",y="+e.getY());
            arr.add(new MyShape(e.getX(), e.getY()));
            repaint();
            // repaint() --> update(g) --> paint(g)
        };

        @Override
        public void mouseClicked(MouseEvent e) {;}
        @Override
        public void mouseReleased(MouseEvent e) {;}
        @Override
        public void mouseEntered(MouseEvent e) {;}
        @Override
        public void mouseExited(MouseEvent e) {;}
    };//inner

};//outer

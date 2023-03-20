package mycom.mytest.main;

import mycom.mytest.duck.DuckManager;

import java.awt.*;

public class MyFrame extends Frame{
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    DuckManager mgr = new DuckManager();

    public MyFrame() {
        super();
        setBackground(Color.lightGray);
        this.setSize(mycom.mytest.duck.MyFrame.FRAME_WIDTH, mycom.mytest.duck.MyFrame.FRAME_HEIGHT);
        this.setVisible(true);
    }
    public void paint(Graphics g) {
        if(mgr!=null) {
            mgr.displayAllDucks(g);
            mgr.swimAllDucks(g);
        }
    }//paint
}

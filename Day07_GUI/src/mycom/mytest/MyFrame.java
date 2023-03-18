package mycom.mytest;

import java.awt.*;
import java.awt.image.DataBufferUShort;

public class MyFrame extends Frame {
    Duck[] arr = new Duck[10];

    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;

    public MyFrame() {
        super();

        makeDucks();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }

    private void makeDucks() {
        for (int i=0;i< arr.length;i++) {
            arr[i] = new Duck();
        }
    }

    @Override
    public void paint(Graphics g) {
        if(arr!=null) {
            for(int i=0;i<arr.length;i++) {
                if (arr[i]!=null) {
                    arr[i].display(g);
                }//if
            }//for
        }//if
    }
}

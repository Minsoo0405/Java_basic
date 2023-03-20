package mycom.test.duck;

import java.awt.*;
import java.awt.datatransfer.FlavorEvent;
import java.util.Random;

public class MyFrame extends Frame {
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    Duck[] darr = new Duck[20];

    public MyFrame() {
        super();
        makeDucks();
        setBackground(Color.lightGray);
        this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
        this.setVisible(true);
    }
    private void makeDucks() {
        int type = 0;
        Random rnd = new Random();
        for(int i=0;i< darr.length;i++) {
            type = rnd.nextInt(4);
            switch (type) {
                case 0:
                    darr[i] = new MallardDuck();
                    break;
                case 1:
                    darr[i] = new RedDuck();
                    break;
                case 2:
                    darr[i] = new RubberDuck();
                    break;
                case 3:
                    darr[i] = new DecoyDuck();
                    break;
                default:
                    darr[i] = new MallardDuck();
            }//swtich
        }//for
    }//makeDucks()
    public void paint(Graphics g) {
        for(Duck d: darr) {
            if(d != null) {
                d.display(g);
                d.swim(g);
                if(d instanceof Flyable) {
                    Flyable fd = (Flyable) d;
                    fd.fly(g);
                }//if
                if(d instanceof Cryable) {
                    Cryable cd = (Cryable) d;
                    cd.cry(g);
                }//if
            }//if
        }//for
    }//paint
}

package mycom.mytest;

public class Duck {
    protected int x;
    protected int y;
    public static final int DUCK_SIZE = 50;

    public Duck() {
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
        y = rnd.nextInt(MyFrame.FRAME_WIDTH-140)+70;
    }

    public Duck(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void quack(Graphics g) {
        g.drawString("꽥꽥", x, y-2);
    }
    public abstract void display(Graphics g);
};


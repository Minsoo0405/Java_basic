package mycom.mytest;

public class MallardDuck extends Duck {
    public MallardDuck() {
        //super();
    }
    public MallardDuck(int x, int y) {
        super(x, y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x,y,Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

    public void change(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("변신", x+Duck.DUCK_SIZE+2, y);
    }
}


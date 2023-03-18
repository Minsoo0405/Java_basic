package mycom.mytest;

public class RedDuck extends Duck {

    public RedDuck() {
        myShape = "RedDuck";
    }

    public RedDuck(int x, int y) {
        super(x, y);
        myShape = "RedDuck";
    }
    @Override
    public void display() {
        System.out.println(x+","+y+"="+myShape+":빨간색");
    }
}

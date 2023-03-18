package mycom.mytest;

public class MallardDuck extends Duck {

    public MallardDuck() {
        myShape = "MallardDuck";
    }

    public MallardDuck(int x, int y) {
        super(x, y);
        myShape = "MallardDuck";
    }
    @Override
    public void display() {
        System.out.println(x+","+y+"="+myShape+":파란색");
    }
}

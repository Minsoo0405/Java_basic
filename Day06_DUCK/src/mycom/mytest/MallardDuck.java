package mycom.mytest;

public class MallardDuck extends Duck{

    public MallardDuck() {
        super();
        myShape = "MallardDuck";
    }

    public MallardDuck(int x, int y) {
        super(x, y);
        myShape = "MallardDuck";
    }

    public void show() {

    }

    @Override
    public void display() {
        super.display();
        System.out.println("파란색");
    }
};

package mycom.mytest;

public class MyFrame extends Frame {
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    Duck[] darr = new Duck[10]; // Super Class

    public MyFrame() {
        super();//Frame f = new Frame();
        makeDucks();
        this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT); //f.setSize();
        this.setVisible(true); // 독점권요청 --> OS ==> 독점권뺏고 다시 부여 --> paint(g);
    }

    private void makeDucks() {
        //랜덤하게 타입이 결정되도록!!
        int type=1;
        Random rnd = new Random();

        for(int i=0;i<darr.length;i++) {
            type = rnd.nextInt(2); //0,1
            switch (type) {
                case 0:
                    //Duck d = new MallardDuck();
                    darr[i] = new MallardDuck(); // upcasting
                    break;
                case 1:
                    //Duck d = new RedDuck();
                    darr[i] = new RedDuck(); // upcasting
                    break;
                default:
                    darr[i] = new MallardDuck();
            }
        }//for
    }

    @Override
    public void paint(Graphics g) {
        for(Duck d:darr) {
            d.quack(g);
            d.display(g); // 업캐스팅이 일어나면 자식에서 확장한 기능은 접근 불가능하나, 추상메소드는 접근가능

            /*
            //MallardDuck --> change()
            if(d instanceof MallardDuck) {
                MallardDuck md = (MallardDuck) d; //자식 = 부모
                md.change(g);
              */
        }
    }//paint
};


package mycom.test;

public class Main {
    public static void main(String[] args) {
        //전체 프로세스의 로직
        //실체생성(메모리생성)-->실행하려고

        // Player
        int i =0;
        Player pobj = new Player();
        pobj.display();
        Player pobj2 = new Player();
        pobj2.display();

        // Enemy
        Enemy eobj1 = new Enemy();
        eobj1.display();
        Enemy eobj2 = new Enemy();
        eobj2.display();
        Enemy eobj3 = new Enemy();
        eobj3.display();
        Enemy eobj4 = new Enemy();
        eobj4.display();
    }
}

public class MyClass {
    // public 리턴타입 메소드명( 매개변수 등 ){ 구현 }

    // 리턴타입이 없는 메소드
    public void method1(){
        System.out.println("m1이 실행됨..");
    }

    // 매개변수는 있지만 리턴값이 없는 메소드
    public void method2(int x) {
        System.out.println(x + " 를 이용한 m2 실행");
    }

    // 매개변수가 없지만 리턴값이 있는 메소드
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }

    // 매개변수가 2개 있지만 리턴값이 없는 메소드
    public void method4(int x, int y) {
        System.out.println(x + "," + y + " 를 m4 실행");
    }

    // 매개변수를 1개 받아서 리턴값을 갖는 메소드
    public int method5(int z) {
        System.out.println(z+" 를 이용한 m5 실행");
        return z*2;
    }
}

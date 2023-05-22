public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        myclass.method1();

        myclass.method2(3);

        int value1 = myclass.method3();
        System.out.println("m3이 리턴한 값: " + value1);

        myclass.method4(5, 10);

        int value2 = myclass.method5(20);
        System.out.println("m5가 리턴한 값: " +value2);
    }
}

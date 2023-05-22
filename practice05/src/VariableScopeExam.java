public class VariableScopeExam {

    int globalScope = 10;
    static int staticVal = 20;

    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
        System.out.println(staticVal);
    }

    public void scopeTest2(int value2) {
        // globalScope 변수를 제외하고 해당 변수 영역이 아니므로 사용하지 못함
        System.out.println(globalScope);
    //    System.out.println(localScope);
    //    System.out.println(value);
        System.out.println(staticVal);
    }

    public static void main(String[] args) {
        // static한 필드 또는 메소드는 Class가 인스턴스화 되지 않아도 사용할 수 있다.
    //    System.out.println(globalScope);
    //    System.out.println(localScope);
    //    System.out.println(value);
        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        VariableScopeExam v2 = new VariableScopeExam();

        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        v1.staticVal = 50;
        v2.staticVal = 100;

        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        System.out.println(VariableScopeExam.staticVal);
;    }
}

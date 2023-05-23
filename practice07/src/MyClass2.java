public class MyClass2 {
    // 메소드 오버로딩
    // 매개변수의 이름보다 타입이 중요!!
    public int plus(int x, int y) {
        return x + y;
    }

    public int plus(int x, int y, int z) {
        return x + y + z;
    }

    public String plus(String x, String y) {
        return x + y;
    }
}

public class Truck extends Car2 {
    public Truck() {
        super("BMW"); // 컴파일러가 자동으로 부모의 생성자도 호출한다.
        System.out.println("Truck의 기본 생성자입니다.");
    }
}

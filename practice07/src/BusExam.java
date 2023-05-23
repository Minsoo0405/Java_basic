public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();

        bus.run();
        bus.ppangppang();

        Car car = new Car();
        car.run();
//      car.ppangppang(); // 부모 클래스는 자식이 가진 것을 사용하지 못함.
    }
}

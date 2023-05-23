public class BusExam {
    public static void main(String[] args) {
        // 부모 타입으로 자식을 가리킬 수 있지만
        // 부모가 가지고 있는 내용만 사용 가능
        Car car = new Bus();
        car.run();

        // 클래스 형변환
        Bus bus = (Bus)car;
        bus.run();
        bus.ppangppang();

    }
}

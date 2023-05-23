public class CarExam2 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        Car c2 = new Car("KIA");
        // Car c3 = new Car(); // 컴파일 오류가 발생

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}

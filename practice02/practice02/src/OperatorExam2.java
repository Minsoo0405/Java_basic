public class OperatorExam2 {
    public static void main(String[] args) {
        // 비교연산자
        int i = 10;
        int j = 14;

        System.out.println(i = j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i > j);

        // 복합 대입 연산자
        i += 10;

        System.out.println(i);
        System.out.println(i -= 5);
    }
}
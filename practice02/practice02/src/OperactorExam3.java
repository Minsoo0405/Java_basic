public class OperactorExam3 {
    public static void main(String[] args) {
        // 연산자 우선 순위
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a - b * c);
        System.out.println((a - b) * c);

        System.out.println(a > 5 && b > 5);
        System.out.println(a > 5 || b > 5);

        System.out.println(++a - 5);
        System.out.println(a++ - 5);
        System.out.println(a);
    }
}

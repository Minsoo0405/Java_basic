public class OperatorExam {
    public static void main(String[] args) {

        // 부호 연산자
        int i1 = -5;
        int i2 = +11;
        int i3 = -i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        // 증감 연산자
        int i4 = ++i3; // => i3 = i3+1;
        System.out.println(i3);
        System.out.println(i4);

        int i5 = i3++; // => i3 = i3 +1;
        System.out.println(i3);
        System.out.println(i5);

        // 산술연산자
        int i = 9;
        int j = 2;
        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j); // 정수들끼리의 연산이므로 결과값도 정수
        System.out.println(i / (double) j);
        System.out.println(i % j);
    }
}

package mycom.test;

public class Main2 {
    public static void  main(String[] args) {
        int i = 10;
        double d = 17.5;

        double result = 0.0;

        result = (double)i; //double = int;(암묵적 형변환 지원)

        // cast 연산자 = 형변환 연산자
        i = (int)d; // int(4B) = result(8B)

        System.out.println("result="+1);

        int ch = 'c'; // 문자 -> 숫자
        System.out.println(ch);

        ch = 0;
        // 형변환 - 논리형을 제외한 7가지 기본자료형에 대해 암묵적 형변환, 명시적 형변환을 지원한다

    }
}

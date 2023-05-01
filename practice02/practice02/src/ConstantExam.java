public class ConstantExam {
    public static void main(String[] args) {
        int i;
        i = 10;

        final int J;
        J = 10;

        // 원의 넓이 구하는 식 만들기
        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        // 기름값을 계산하는 식 만들기
        final int OIL_PRICE = 1450; // 기름값이 변동되었을때, 상수값만 변경해주면 된다.

        int totalPrice = 50 * OIL_PRICE;
    }
}

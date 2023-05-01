public class TypeCastingExam {
    public static void main(String[] args) {
        int x = 50000;
        long y = x ;

        System.out.println(x);

        long x2 = 5;
        int y2 = (int) x2; // 강제 형변환을 통해 오류 없앰
    }
}

public class ForExam {
    public static void main(String[] args) {
//        int total = 0;
//        for (int i = 1; i <= 100; i++) {
//            total = total + i;
//        }

//        System.out.println(total);

        // 짝수일때만, 합하는 경우
//        int total = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            total = total + i;
//        }

//        System.out.println(total);

        // i=50일때까지만 합하는 경우
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                break;
            }
            total = total + i;
        }

        System.out.println(total);
    }
}

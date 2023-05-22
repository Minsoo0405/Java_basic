public class ForEachExam {
    public static void main(String[] args) {
        int[] iarr = {10,20,30,40,50};

        for(int i = 0; i < iarr.length; i++){
            int value = iarr[i];
            System.out.println(value);
        }

        // for(for문 내에서 받아줄 변수 : 값을 전달해줄수 있는 변수)
        for(int value:iarr) {
            System.out.println(value);
        }
    }
}

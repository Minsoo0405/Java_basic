public class ArrayWithFor {
    public static void main(String[] args) {
        int [] iarray = new int[100];
        iarray[0] = 1;
        iarray[1] = 2;

        // 배열의 인덱스에 값을 넣는 중
        for(int i = 0; i < iarray.length; i++){
            iarray[i] = i + 1;
        }

        // 배열의 값을 꺼내서 합을 구하는 중
        int sum = 0;
        for(int i = 0; i < iarray.length; i++){
            sum = sum + iarray[i];
        }

        System.out.println(sum);
    }
}

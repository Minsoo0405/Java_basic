import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);

        do{
            //반복문 문장들
            value = scan.nextInt();
            System.out.println("입력받은 수: " +value);
        }while(value != 10); // 입력받은 값이 10이 아닐 경우에는 계속 반복

        System.out.println("반복문 종료!!");
    }
}

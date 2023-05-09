import java.sql.SQLOutput;

public class SwitchExam {
    public static void main(String[] args) {
        // switch, cas, default, break

        int value = 1;

        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("그 외에 다른 숫자");
        }

        String str = "B";
        switch (str) {
            case "A":
                System.out.println("1");
                break;
            case "B":
                System.out.println("2");
                break;
            case "C":
                System.out.println("그 외의 문자");
        }
    }
}

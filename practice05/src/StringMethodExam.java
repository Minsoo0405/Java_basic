import java.sql.Struct;

public class StringMethodExam {
    public static void main(String[] args) {
        // String str = new String("hello");
        String str = "hello world";
        System.out.println(str.length());
        System.out.println(str.concat(" !!"));

        System.out.println(str);

        str = str.concat(" !!");
        System.out.println(str);

        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 7));
    }
}

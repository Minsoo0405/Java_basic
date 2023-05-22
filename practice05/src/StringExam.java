public class StringExam {
    public static void main(String[] args) {

        // 상수영역에 생성함 / "같은 인스턴스를 참조한다."  (str1 == str2)
        String str1 = "hello";
        String str2 = "hello";

        // hip 영역에 생성함 / 각각 다른 영역임 (str3 != str4)
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2)
            System.out.println("str1과 str2는 같은 래퍼런스입니다.");
        if(str1 == str3)
            System.out.println("str1과 str3는 같은 래퍼런스입니다.");
        if(str3 != str4)
            System.out.println("str3과 str4는 같은 래퍼런스가 아닙니다.");

        System.out.println(str1);
        System.out.println(str1.substring(3));
    }
}

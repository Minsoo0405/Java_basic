public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // gender2 = "boy2"; => enum을 통해서 해당 입력된 값만 할당받을 수 있게 하였음
    }
}

enum Gender{
    MALE, FEMALE;
}
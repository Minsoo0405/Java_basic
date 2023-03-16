package mycom.test;

import java.util.Random;

public class Student {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(int studentNum, String studentName, int koreaScore, int englishScore, int mathScore) {
        num = studentNum;
        name = studentName;
        kor = koreaScore;
        eng = englishScore;
        math = mathScore;
    }
    public void display() {
        System.out.println("학번:"+num+ ", 이름="+name+ ", 국어="+kor+ ", 영어="+eng+ ", 수학="+math+ ", 총점="+(kor+eng+math));
    }
}

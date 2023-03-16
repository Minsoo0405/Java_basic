package mytest.mycom;

public class StudentInfo {

    //속성 = 인스턴스 변수
    private int sid;
    private String sname;
    private int kor;
    private int math;
    private int eng;
    private int total;

    public StudentInfo() {

    }
    //다형성 = 메소드의 오버로딩(Overload)
    public StudentInfo(int sid, String sname, int kor, int math, int eng) {
        this.sid = sid;
        this.sname = sname;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.total = this.kor + this.math + this.eng;
    }//매개변수=지역변수이므로 해당 지역내에서만 활용되는 것

    public void display() {
        System.out.println(this.sid+"\t"+this.sname+"\t"+this.kor+"\t"+this.math+"\t"+this.eng+"\t"+this.total);
    }

    //국어점수를 읽기 위한 요청
    public int getKor() {
        return this.kor;
    }//getKor

    //setter/getter => 국어점수를 변경하기 위한 요청(private으로 설정되어 있음)
    public void set(int kor) {
        if(kor>=0 && kor<=100) {
            this.kor = kor;
        }//if
    }//set
};

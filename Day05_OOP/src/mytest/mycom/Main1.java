package mytest.mycom;

public class Main1 {
    public static void Main1(String[] args) {
        MemberInfo m1 = new MemberInfo(1,"홀길동",20120212,3);
        m1.display();
        MemberInfo m2 = new MemberInfo(2,"김길동",20120812,2);
        m2.display();
        MemberInfo m3 = new MemberInfo(3,"이길동",20130112,10);
        m3.display();
        MemberInfo m4 = new MemberInfo(4,"박길동",20110912,11);
        m4.display();
        MemberInfo m5 = new MemberInfo(5,"최길동",20100712,6);
        m5.display();
        MemberInfo m6 = new MemberInfo(6,"한길동",20120112,8);
        m6.display();
    }
}

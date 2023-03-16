package mytest.mycom;

public class MemberInfo {
    private int mid;
    private String mname;
    private int date;
    private int counts;
    private int point;
    private String grade;

    public MemberInfo() {

    }

    public MemberInfo(int mid, String mname, int date, int counts) {
        this.mid = mid;
        this.mname = mname;
        this.date = date;
        this.counts = counts;

        if (counts<3) {
            this.point = this.counts * 20;
        } else {
            if (counts<5) {
                this.point = this.counts * 30;
            } else {
                this.point = this.counts * 50;
            }
        }// if counts

        if (point<100) {
            this.grade = "Family";
        } else {
            if (point<300) {
                this.grade = "Gold";
            } else if(point < 500) {
                this.grade = "VIP";
            } else {
                this.grade = "VVIP";
            }
        }// if grade
    }//MemberInfo(...)

    public void display() {
        System.out.println(this.mid+"\t"+this.mname+"\t"+this.date+"\t"+this.counts+"\t"+this.point+"\t"+this.grade);
    }
}

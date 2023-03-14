package mycom;

public class Homework3 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int b=0; b<i; b++) {
                System.out.print(" ");
            }//for b
            for(int j=5; j>i; j--) {
                System.out.print("*");
            }//for i
            System.out.println("");
        }
    }//main
}

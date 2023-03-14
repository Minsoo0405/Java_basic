package mycom.test;

public class Homework02 {
    public static void main(String[] args) {
        // "주머니에 돈이 있으면 택시를 타고, 주머니에 돈은 없지만 카드가 있으면 택시를 타고,
        // 돈도 없고 카드도 없으면 걸어 가라."
        boolean money = false;
        boolean card = false;

        if (money == true || card == true) {
            System.out.println("택시를 타라");
        } else {
            System.out.println("걸어가라");
        }
    } //main
}
package mycom.test;

public class Main3 {
    public static void main(String[] args) {
        // 돈이 3000원 이상 있거나 카드가 있다면 택시를 타고가라!
        int money = 10000;
        boolean card = true;

//		if(money>=3000) {
//			System.out.println("money : 택시를 타고 가라!");
//		}else {
//			if(card == true ) {
//				System.out.println("card : 택시를 타고 가라!");
//			}else {
//				System.out.println("걸어가라!");
//			}
//		}

        if((money>=3000) || card) {
            System.out.println("택시를 타고 가라!");
        }else {
            System.out.println("걸어가라!");
        }
    }
}

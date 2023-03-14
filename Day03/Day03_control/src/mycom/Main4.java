package mycom;

public class Main4 {

    public static int getMax(int x, int y) { // 매개변수

        int max=x; //지역변수

        if(max < y) {
            max = y;
        }
        System.out.println("max="+max);

        return max; // return과 함께 max 변수는 자동수거


    }
    public static void main(String[] args) {

        //입력된 두 수의 크기를 비교해서 큰 수 출력하기.
        System.out.println("1.함수호출 시작.");
        int a=20, b=30;
        int result = 0;

        result = getMax(a, b);// call
        System.out.println("2.함수호출 시작.");
        getMax(70,120); //call



    }//main

};

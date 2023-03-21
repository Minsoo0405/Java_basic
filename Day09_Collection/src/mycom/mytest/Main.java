package mycom.mytest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        /* 1) ArrayList & LinkedList
        순서있게 데이터를 저장/탐색(관리)하는 자료구조
        순서를 관리하는 기술 = index
        CollectionFramework의 클래스들은 데이터를 Object 형태만 관리한다.
        동적관리(크기를 실행도중 변경할 수 있어요)

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);

        LinkedList<Object> alist = new LinkedList<Object>();
        alist.add(30);
        alist.add(40);
        */

        //2-1) String
        /*
        String str = new String("Hello");
        String str2 = "Hello";

        ArrayList<Object> blist = new ArrayList<Object>();
        blist.add("Hello"); // String --> Object(upcasting)
        blist.add("World");
        blist.add("!!!");

        for (Object obj : blist) {
            String sobj = (String)obj;
            System.out.println(sobj.toUpperCase());
        }

        */

        //2-2) String(upcasting)
        ArrayList<String> clist = new ArrayList<String>();
        clist.add("Hello"); // String --> Object(upcasting)
        clist.add("World");
        clist.add("!!!");

        for(String obj:clist) {
            System.out.println(obj.toUpperCase());
        }
    }
}

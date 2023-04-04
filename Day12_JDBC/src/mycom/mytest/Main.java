package mycom.mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // 내 db 접속에 사용할 conn 변수
        Connection conn = null;
        //오라클 드라이버 경로 설정
        String driver = "oracle.jdbc.driver.OracleDriver";
        //내 db의 계정 경로 설정
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        //접속 성공, 실패 여부 사용시 쓰는 변수
        Boolean connect = false;

        // db 접속 코드는 반드시 try~catch문 안에 써줘야함
        try {
            //오라클 드라이버 접속
            Class.forName(driver);
            //내 db 접속
            conn = DriverManager.getConnection(url, "scott", "tiger");
            // 접속성공시 true 설정;
            connect = true;
            Statement stmt = conn.createStatement();
            String query = "select * from emp";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.println(rs.getString(2));

            }

            // 접속 끊기, 끊는 이유 : 항상 db가 연결되어있으면 접속 오류 및 데이터 충돌이 일어나기 때문
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();

        } catch (Exception e) {
            System.out.println("실패");
            System.out.println(e);
        }
    }
}
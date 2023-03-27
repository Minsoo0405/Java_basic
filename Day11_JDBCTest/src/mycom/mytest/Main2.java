package mycom.mytest;

import java.sql.*;

public class Main2 {
    public static void main(String[] args) {
        //Connection
        Connection conn = null;

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String pw = "tiger";
        String driver = "oracle.jdbc.driver.OracleDriver";

        try {
            //Connection 설정: TCP 특성
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pw);

            if(conn != null) {
                System.out.println("연결 성공");
            }
            // 데이터 전송(sql로 명령어를 던지면 그 결과를 받아 처리)
            Statement stmt = conn.createStatement();
            String query = "select * from emp";

            ResultSet rs = stmt.executeQuery(query);
            //cursor 작동하여 관리

            while(rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.println(rs.getString(2));

            }//while

            if(rs!=null) rs.close();
            if(stmt!=null) stmt.close();
            if(conn!=null) conn.close();

        } catch (SQLException e) {
            //갑작스런 종료 대신 정상 종료로 유도하는 기술
            System.out.println("url이나 입력정보가 올바르지 않습니다.");
        } catch (ClassNotFoundException e) {
                System.out.println("드라이버가 유효하지 않습니다.");
            }

    }
};

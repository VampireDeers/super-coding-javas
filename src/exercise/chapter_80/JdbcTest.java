package exercise.chapter_80;

import java.sql.*;

public class JdbcTest {
    // MySQL 데이터베이스 연결 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chapter_78";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12341234";

    public static void main(String[] args) {
        /**
         * 1000원 이상 산 group singer를 구하는 SELECT 문을 JDBC로 실행해보자.
         * Group_singe에 새로운 singer ”르세라핌”을 넣어 INSER 문을 JDBC로 실행해보자
         */

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement();
        ) {

            String sqlQuery = "SELECT * " +
                              "FROM group_singer G" +
                              "         INNER JOIN buy_history_1 B" +
                              "     ON G.mem_id = B.mem_id" +
                              "         WHERE B.price > 1000";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                String id = resultSet.getNString("mem_id");
                String name = resultSet.getString("mem_name");
                int num = resultSet.getInt("mem_number");

                System.out.println("ID: " + id + ", Name: " + name + ", mem_number: " + num);
            }

            String sqlQuery2 = "INSERT INTO group_singer (mem_id, mem_name, mem_number, addr, phone, height, debut_date)" +
                               "VALUES ('mem120', '르세라', 5, '서울', '01012345678', 171, '2013-06-13')";

            statement.executeUpdate(sqlQuery2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


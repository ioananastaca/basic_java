package jdbc;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            //Establish connection object
            Connection conn = DriverManager.getConnection(url,"root","Ioana1234");

            //create a statement object to send to the database
            Statement statement = conn.createStatement();

            //send the query to the database/execute the statemnt object
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            //process the result
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

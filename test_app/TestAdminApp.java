package test_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestAdminApp {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER DATABASE NAME :");
        String db_name = scanner.nextLine();
        System.out.println("ENTER USERNAME :");
        String username = scanner.nextLine();
        System.out.println("ENTER PASSWORD :");
        String password = scanner.nextLine();
        String url = "jdbc:mysql://localhost:3306/ "+db_name;
        Connection db_connection = DriverManager.getConnection(url, username, password);

        try (db_connection) {
            Statement statement = db_connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Customers"
                                );
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+"   "+resultSet.getString(2)+"   "+resultSet.getString(3)+"   "+resultSet.getString(4));
            }


            


            scanner.close();

        } catch (SQLException e) {
            
            e.printStackTrace();
        }


    }
}

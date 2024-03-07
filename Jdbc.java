// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
<<<<<<< HEAD
import java.sql.SQLException;
import java.sql.Statement;
// import java.util.Scanner;
import java.util.Scanner;
=======
// // import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// // import java.util.Scanner;
// // import java.util.Scanner;
>>>>>>> b192365 (	deleted:    Jdbc.class)

// /**
//  * Jdbc
//  */
// public class Jdbc {

//     // private static final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS
//     // Students (\n"
//     // + " id INT AUTO_INCREMENT PRIMARY KEY,\n"
//     // + " first_name VARCHAR(255),\n"
//     // + " last_name VARCHAR(255),\n"
//     // + " email VARCHAR(255)\n"
//     // + ")";

//     // private static final String[] SQL_INSERT_SAMPLE_DATA = {
//     // "INSERT INTO employees (first_name, last_name, email) VALUES ('John', 'Doe',
//     // 'john@example.com')",
//     // "INSERT INTO employees (first_name, last_name, email) VALUES ('Jane',
//     // 'Smith', 'jane@example.com')"
//     // };
//     public static void main(String[] args) throws ClassNotFoundException, SQLException {
//         // Scanner scanner = new Scanner(System.in);
//         String url = "jdbc:mysql://localhost:3306/ testjdbc";
//         String user = "root";
//         String password = "qwerty";

//         // String init_char = scanner.nextLine();

//         // Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection con = DriverManager.getConnection(url, user, password);

//         try (con) {

//             Statement statement = con.createStatement();
//             ResultSet resultSet = statement
//                     .executeQuery("select * from employees where id=(select max(id) from employees) ");

//             while (resultSet.next()) {
//                 System.out.println(resultSet.getString(1) + "   " + resultSet.getString(2) + "   "
//                         + resultSet.getString(3) + "   " + resultSet.getString(4));
//             }

//         } catch (Exception e) {
//             System.out.println("ERROR!");
//             // System.out.println(e.getMessage());
//             e.printStackTrace();
//         }

//     }
// }

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees {
    public static void main(String[] args) {

 try {

     DriverManager.registerDriver(new Driver());
     Connection connection = DriverManager.getConnection(
             // DB connection url
             "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
             // DB username
             "root",
             // DB password
             "codeup"
     );
     Statement statement = connection.createStatement();
     ResultSet resultSet = statement.executeQuery("SELECT * FROM employees limit 10");


        List<String> firstNames = new ArrayList<>();

     while (resultSet.next()) {

         String firstName = resultSet.getString("first_name");
//         System.out.println(resultSet.getString("first_Name"));
            firstNames.add(firstName);
         }
     System.out.println(firstNames);








     }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
// register driver
// create connection
// create statement
// (Select) execute the query with statement
// scroll through ResultSet to print out first 10 employee first names
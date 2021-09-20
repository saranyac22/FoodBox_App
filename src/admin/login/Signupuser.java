package admin.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Signupuser {

    public int registerUser(signup_user user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO user_details" +
            "  (userid,fname,lname,emailid, contactno,password) VALUES " +
            " (?,?,?,?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost/mysql", "root", "Simplilearn");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	preparedStatement.setString(1, user.getUserid());
            preparedStatement.setString(2, user.getFname());
            preparedStatement.setString(3, user.getLname());
            preparedStatement.setString(4, user.getEmailid());
            preparedStatement.setString(5, user.getContactno());
            preparedStatement.setString(6, user.getPassword());
           
          

          
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

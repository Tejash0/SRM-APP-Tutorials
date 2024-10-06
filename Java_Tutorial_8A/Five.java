import java.sql.*;

public class Five {
    public static void main(String[] args) {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/database1";
            String username = "root";
            String password = "";

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a prepared statement with placeholders
            String deleteQuery = "DELETE FROM employees WHERE employee_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            // Set the value for the placeholder
            preparedStatement.setInt(1, 1005);

            // Execute the delete statement
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Failed to delete record.");
            }

            // Close the resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
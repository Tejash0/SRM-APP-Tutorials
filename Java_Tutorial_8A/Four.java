import java.sql.*;

public class Four {
    public static void main(String[] args) {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/database1";
            String username = "root";
            String password = "";

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a prepared statement with placeholders
            String updateQuery = "UPDATE orders SET order_status = ? WHERE order_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            // Set values for the placeholders
            preparedStatement.setString(1, "Shipped");
            preparedStatement.setInt(2, 1001);

            // Execute the update statement
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("Failed to update record.");
            }

            // Close the resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
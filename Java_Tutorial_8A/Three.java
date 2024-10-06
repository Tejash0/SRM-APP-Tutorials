import java.sql.*;

public class Three {
    public static void main(String[] args) {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/database1";
            String username = "root";
            String password = "";

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a prepared statement with placeholders
            String insertQuery = "INSERT INTO products (product_id, product_name, price) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Set values for the placeholders
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Laptop");
            preparedStatement.setDouble(3, 999.99);

            // Execute the insert statement
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("New record inserted successfully.");
            } else {
                System.out.println("Failed to insert new record.");
            }

            // Close the resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
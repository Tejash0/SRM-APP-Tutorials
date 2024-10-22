import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Three {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/database1"; // Replace with your DB name
        String username = "root"; // Replace with your DB username
        String password = ""; // Replace with your DB password

        // SQL Insert Query
        String insertQuery = "INSERT INTO products (name, price, quantity) VALUES (?, ?, ?)";

        try {
            // 1. Establishing a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // 2. Creating a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // 3. Setting the values for the placeholders (?)
            preparedStatement.setString(1, "Laptop"); // Name
            preparedStatement.setDouble(2, 999.99); // Price
            preparedStatement.setInt(3, 5); // Quantity

            // 4. Executing the update
            int rowsInserted = preparedStatement.executeUpdate();

            // 5. Check if the insertion was successful
            if (rowsInserted > 0) {
                System.out.println("A new product was inserted successfully!");
            }

            // 6. Closing the connection
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
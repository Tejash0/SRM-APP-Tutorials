import java.sql.*;

public class Two {
    public static void main(String[] args) {
        try {
            // Replace with your database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/database1";
            String username = "root";
            String password = "";

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement object to execute the query
            Statement statement = connection.createStatement();

            // Execute the SELECT query
            String query = "SELECT * FROM customers";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the results
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                // ... other columns
                System.out.println("Customer ID: " + customerId + ", Name: " + customerName);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
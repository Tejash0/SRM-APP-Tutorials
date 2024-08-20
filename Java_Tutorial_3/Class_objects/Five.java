import java.util.*;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    public ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Product added to cart: " + product.getName());
    }

    public void removeProduct(Product product) {
        if (items.remove(product)) {
            System.out.println("Product removed from cart: " + product.getName());
        } else {
            System.out.println("Product not found in cart: " + product.getName());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (Product product : items) {
                System.out.println(product.getName() + " - Price: " + product.getPrice() + " - Quantity: "
                        + product.getQuantity());
            }
        }
    }
}

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Calculate total");
            System.out.println("4. Display cart");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("Enter product name:");
                String name = scanner.nextLine();
                System.out.println("Enter product price:");
                double price = scanner.nextDouble();
                System.out.println("Enter product quantity:");
                int quantity = scanner.nextInt();

                Product product = new Product(name, price, quantity);
                cart.addProduct(product);

            } else if (choice == 2) {
                System.out.println("Enter product name to remove:");
                String name = scanner.nextLine();

                Product productToRemove = null;
                for (Product product : cart.items) {
                    if (product.getName().equals(name)) {
                        productToRemove = product;
                        break;
                    }
                }

                if (productToRemove != null) {
                    cart.removeProduct(productToRemove);
                } else {
                    System.out.println("Product not found in cart.");
                }

            } else if (choice == 3) {
                double total = cart.calculateTotal();
                System.out.println("Total price of items in cart: " + total);

            } else if (choice == 4) {
                cart.displayCart();

            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
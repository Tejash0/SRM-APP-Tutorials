import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;
    private double rating;

    public MenuItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

class Restaurant {
    private List<MenuItem> menuItems;

    public Restaurant() {
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(String name, double price, double rating) {
        MenuItem menuItem = new MenuItem(name, price, rating);
        menuItems.add(menuItem);
    }

    public void removeMenuItem(String name) {
        menuItems.removeIf(menuItem -> menuItem.getName().equals(name));
    }

    public double calculateAverageRating() {
        double sum = 0;
        for (MenuItem menuItem : menuItems) {
            sum += menuItem.getRating();
        }
        return sum / menuItems.size();
    }

    public void printMenu() {
        for (MenuItem menuItem : menuItems) {
            System.out.println("Name: " + menuItem.getName() + ", Price: " + menuItem.getPrice() + ", Rating: "
                    + menuItem.getRating());
        }
    }
}

public class Eight {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add menu item");
            System.out.println("2. Remove menu item");
            System.out.println("3. Print menu");
            System.out.println("4. Calculate average rating");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter menu item name: ");
                    String name = scanner.next();
                    System.out.print("Enter menu item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter menu item rating: ");
                    double rating = scanner.nextDouble();
                    restaurant.addMenuItem(name, price, rating);
                    break;
                case 2:
                    System.out.print("Enter menu item name to remove: ");
                    String removeName = scanner.next();
                    restaurant.removeMenuItem(removeName);
                    break;
                case 3:
                    System.out.println("Menu:");
                    restaurant.printMenu();
                    break;
                case 4:
                    System.out.println("Average Rating: " + restaurant.calculateAverageRating());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            scanner.close();
        }
    }
}
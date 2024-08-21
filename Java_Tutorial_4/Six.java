
//Kumar Tejash
//RA2311003011446
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class SRMLibrary {
    private List<Book> books;
    private Scanner scanner;

    public SRMLibrary(Scanner scanner) {
        this.books = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addBook() {
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void removeBook() {
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.nextLine();
        boolean removed = books.removeIf(book -> book.getTitle().equals(title));
        if (removed) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println((i + 1) + ". Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }
}

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SRMLibrary library = new SRMLibrary(scanner);

        boolean running = true;
        while (running) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.removeBook();
                    break;
                case 3:
                    library.listBooks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

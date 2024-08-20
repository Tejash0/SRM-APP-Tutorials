import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define a Book class
class Book {
    private String title;
    private String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods to retrieve title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Define the SRMLibrary class
class SRMLibrary {
    private List<Book> books;

    // Constructor to initialize books list
    public SRMLibrary() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book added successfully!");
        scanner.close();
    }

    // Method to remove a book from the library
    public void removeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.nextLine();
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
        scanner.close();
    }

    // Method to list all books in the library
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

// Define the Six class with the main method
public class Six {
    public static void main(String[] args) {
        // Create a new SRMLibrary instance
        SRMLibrary library = new SRMLibrary();

        // Prompt the user to add or remove books
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

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
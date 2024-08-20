import java.util.ArrayList;
import java.util.Scanner;

class SRMISTBook {
    private String title;
    private String author;
    private String ISBN;

    public SRMISTBook(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and setters for the attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}

class BookCollection {
    private ArrayList<SRMISTBook> bookCollection = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. List all books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    listAllBooks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String ISBN = scanner.nextLine();

        SRMISTBook book = new SRMISTBook(title, author, ISBN);
        bookCollection.add(book);
        System.out.println("Book added successfully!");
    }

    private void removeBook() {
        System.out.print("Enter book title to remove: ");
        String title = scanner.nextLine();

        for (SRMISTBook book : bookCollection) {
            if (book.getTitle().equals(title)) {
                bookCollection.remove(book);
                System.out.println("Book removed successfully!");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    private void listAllBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (SRMISTBook book : bookCollection) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println();
            }
        }
    }
}

public class Five {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.run();
    }
}
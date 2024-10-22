import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class One extends JFrame {

    private ArrayList<Book> bookList = new ArrayList<>();
    private DefaultTableModel tableModel;
    private JTable bookTable;
    private JTextField searchField;
    private JTextField titleField, authorField, isbnField, yearField;
    private JComboBox<String> genreComboBox;
    private JCheckBox availabilityCheckBox;

    public One() {
        // Set up JFrame
        setTitle("Library Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Set up MenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Set up Toolbar
        JToolBar toolBar = new JToolBar();
        JButton addBookButton = new JButton("Add Book");
        JButton removeBookButton = new JButton("Remove Book");
        JButton searchButton = new JButton("Search");
        toolBar.add(addBookButton);
        toolBar.add(removeBookButton);
        toolBar.add(searchButton);
        add(toolBar, BorderLayout.NORTH);

        // Set up TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Book Details Panel (with GridBagLayout for better control)
        JPanel bookDetailsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Small spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL; // Make components stretch horizontally

        titleField = new JTextField(20);
        authorField = new JTextField(20);
        isbnField = new JTextField(20);
        yearField = new JTextField(20);
        genreComboBox = new JComboBox<>(new String[] { "Fiction", "Non-Fiction", "Science", "History" });
        availabilityCheckBox = new JCheckBox("Available");

        // Add components to bookDetailsPanel with centering
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        bookDetailsPanel.add(new JLabel("Title:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        bookDetailsPanel.add(titleField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        bookDetailsPanel.add(new JLabel("Author:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        bookDetailsPanel.add(authorField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        bookDetailsPanel.add(new JLabel("ISBN:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        bookDetailsPanel.add(isbnField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        bookDetailsPanel.add(new JLabel("Publication Year:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        bookDetailsPanel.add(yearField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        bookDetailsPanel.add(new JLabel("Genre:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        bookDetailsPanel.add(genreComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        bookDetailsPanel.add(new JLabel("Availability:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        bookDetailsPanel.add(availabilityCheckBox, gbc);

        // Add buttons at the bottom
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        bookDetailsPanel.add(new JButton("Add Book"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        bookDetailsPanel.add(new JButton("Update Book"), gbc);

        tabbedPane.addTab("Book Details", bookDetailsPanel);

        // Book List Panel
        JPanel bookListPanel = new JPanel(new BorderLayout());
        String[] columnNames = { "Title", "Author", "ISBN", "Genre", "Available" };
        tableModel = new DefaultTableModel(columnNames, 0);
        bookTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        bookListPanel.add(scrollPane, BorderLayout.CENTER);

        // Search Bar
        JPanel searchPanel = new JPanel(new BorderLayout());
        searchField = new JTextField();
        JButton searchBtn = new JButton("Search");
        searchPanel.add(searchField, BorderLayout.CENTER);
        searchPanel.add(searchBtn, BorderLayout.EAST);
        bookListPanel.add(searchPanel, BorderLayout.NORTH);

        tabbedPane.addTab("Book List", bookListPanel);

        add(tabbedPane, BorderLayout.CENTER);

        // Event Handling
        addBookButton.addActionListener(e -> addBook());
        removeBookButton.addActionListener(e -> removeBook());
        searchButton.addActionListener(e -> searchBook());

        setVisible(true);
    }

    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();
        String year = yearField.getText();
        String genre = (String) genreComboBox.getSelectedItem();
        boolean available = availabilityCheckBox.isSelected();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty() || year.isEmpty()) {
            showErrorDialog("Please fill in all fields.");
            return;
        }

        Book book = new Book(title, author, isbn, year, genre, available);
        bookList.add(book);
        tableModel.addRow(new Object[] { title, author, isbn, genre, available });
        clearFields();
    }

    private void removeBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow == -1) {
            showErrorDialog("Please select a book to remove.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?");
        if (confirm == JOptionPane.YES_OPTION) {
            bookList.remove(selectedRow);
            tableModel.removeRow(selectedRow);
        }
    }

    private void searchBook() {
        String searchText = searchField.getText();
        if (searchText.isEmpty()) {
            showErrorDialog("Please enter a search term.");
            return;
        }

        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(searchText)) {
                JOptionPane.showMessageDialog(this, "Book found: " + book.getTitle());
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Book not found.");
    }

    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void clearFields() {
        titleField.setText("");
        authorField.setText("");
        isbnField.setText("");
        yearField.setText("");
        genreComboBox.setSelectedIndex(0);
        availabilityCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(One::new);
    }
}

class Book {
    private String title, author, isbn, year, genre;
    private boolean available;

    public Book(String title, String author, String isbn, String year, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.genre = genre;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    // Other getter methods omitted for brevity
}

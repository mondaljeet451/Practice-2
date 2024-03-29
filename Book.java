public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false; // Initially not borrowed
    }


    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book '" + title + "' borrowed successfully.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is already borrowed.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is not borrowed.");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "Computer", "TYS456");
        Book b2 = new Book("Python", "Computer", "TYS456");
        Book b3 = new Book("C++", "Computer", "TYS456");
        Book b4 = new Book("Rust", "Computer", "TYS456");

        b1.borrowBook();
        b1.borrowBook();

        b1.returnBook();



    }
}
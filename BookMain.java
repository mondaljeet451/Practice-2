public class BookMain{
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Computer", "TYS456");

        b1.borrowBook();
        b1.returnBook();
        b1.borrowBook();
    }
}

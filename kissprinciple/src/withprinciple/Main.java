package withprinciple;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user = new User("Alice");

        // Adding books to the library
        library.addBook(new Book("The Great Gatsby"));
        library.addBook(new Book("Moby Dick"));

        // Borrowing and returning books
        library.borrowBook(user, "The Great Gatsby");
        library.returnBook(user, "The Great Gatsby");
    }
}

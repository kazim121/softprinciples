package withoutprinciple;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    public void borrowBook(User user, String title) {
        Book book = searchBook(title);
        if (book != null && book.isAvailable()) {
            book.borrow();
            user.borrowBook(book);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is unavailable.");
        }
    }
    
    public void returnBook(User user, String title) {
        Book book = searchBook(title);
        if (book != null) {
            book.returnBook();
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}

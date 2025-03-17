package withprinciple;

public class Book {
    private String title;
    private boolean isAvailable;
    
    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }
    
    public String getTitle() {
        return title;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void borrow() {
        isAvailable = false;
    }
    
    public void returnBook() {
        isAvailable = true;
    }
}

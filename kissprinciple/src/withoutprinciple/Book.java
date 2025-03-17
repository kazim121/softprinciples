package withoutprinciple;

public abstract class Book {
    private String title;
    
    public Book(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public abstract boolean isAvailable();
    public abstract void borrow();
    public abstract void returnBook();
}




package withoutprinciple;

    public class ConcreteBook extends Book {
        private boolean isAvailable;
        
        public ConcreteBook(String title) {
            super(title);
            isAvailable = true;
        }
    
        @Override
        public boolean isAvailable() {
            return isAvailable;
        }
    
        @Override
        public void borrow() {
            if (isAvailable) {
                isAvailable = false;
            }
        }
    
        @Override
        public void returnBook() {
            isAvailable = true;
        }
    }

package Question2;

public class Library {
    private String libraryName;
    private Book[] books = new Book[3];
    private int bookCount = 0;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName(){
        return libraryName;
    }
    public void addBook(Book book) {
        if (bookCount < 3) {
            books[bookCount] = book;
            book.setLibrary(this);
            bookCount++;
        } else {
            System.out.println("Library is full. Can not add books. ");
        }
    }
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in Library: ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println();
            books[i].displayBookDetails();
        }
    }
}

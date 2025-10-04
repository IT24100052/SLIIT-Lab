package Question2;

public class Book {
    private String isbn;
    private String title;
    private Library library;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setLibrary(Library lib) {
        this.library = lib;
    }

    public void displayBookDetails() {
        System.out.println("The isbn is:" + isbn);
        System.out.println("The title is: " + title);
        if (library != null) {
            System.out.println("Library name is: " + library.getLibraryName());
        } else {
            System.out.println("library name : not assigned");
            System.out.println();
        }
    }
}

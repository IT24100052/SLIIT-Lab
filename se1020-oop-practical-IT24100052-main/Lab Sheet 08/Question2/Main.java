package Question2;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("045" , "java");
        Book b2 = new Book ("046" , "c++" );
        Book b3 = new Book ("047","C#");

        Library lib = new Library ("SLIIT Library is: ");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        
        lib.displayLibraryDetails();
    }
}

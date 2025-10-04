package Question3;

public class PrinterApp {
    public static void main(String[] args) {
        Document doc = new Document ("My report content is. ","Hello world");
        Printer printer = new Printer();
        printer.printDocument(doc);
    }
}

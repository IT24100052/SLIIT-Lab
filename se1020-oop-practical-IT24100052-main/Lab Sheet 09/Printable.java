public interface Printable {
    void printDetails();
}

class Report implements Printable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
    }
}

class Invoice implements Printable {
    private int invoiceId;

    public Invoice(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public void printDetails() {
        System.out.println("Invoice ID: " + invoiceId);
    }
}

class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];

        Report report1 = new Report("R001");
        Report report2 = new Report("R002");
        Invoice invoice1 = new Invoice(10);
        Invoice invoice2 = new Invoice(20);

        printables[0] = report1;
        printables[1] = report2;
        printables[2] = invoice1;
        printables[3] = invoice2;

        for (Printable p : printables) {
            p.printDetails();
        }
    }
}

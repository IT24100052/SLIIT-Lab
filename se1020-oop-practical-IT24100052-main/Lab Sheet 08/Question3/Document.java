package Question3;

public class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    public void displayDocument() {
        System.out.println("The title is: " + title);
        System.out.println("The content is: " + content);
    }

    public String getTitle(){
       return title;
    }
}

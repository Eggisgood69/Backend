// Book類
class Book {
    private String title;
    private String author;
    private int year;

    // Constructor, getters and setters
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public void setTitle(String title) {
        title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void printInfo() {
        System.out.println("title: " + title + ", author: " + author + ", year: " + year);
    }
}

// Ebook子類
class Ebook extends Book {
    private double fileSize;
    private String format;

    // Constructor, getters and setters
    public Ebook(String title, String author, int year, double fileSize, String format) {
        super(title, author, year);
        this.fileSize = fileSize;
        this.format = format;
    }
    
    @Override
     public void printInfo() {
        super.printInfo();
        System.out.println(" fileSize: " + fileSize + ", format: " + format);
    }
}

public class Books {
    
    public static void main(String[] args) { 
        Ebook ebook = new Ebook("哈利波特", "JK", 2010, 10.5, "PDF");
        ebook.printInfo();
    }
}
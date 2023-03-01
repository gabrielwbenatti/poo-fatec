import java.time.LocalDateTime;

public class Book {
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //attributes
    private long isbn;
    private String title;
    private String author;
    private double price;


    //methods
    public void registryLending() {
        System.out.println("Titulo: " + title);
        System.out.println("Emprestado em " + LocalDateTime.now());
    }

    public void registryDevolution() {
        System.out.println("Titulo: " + title);
        System.out.println("Devolvido em " + LocalDateTime.now());
    }

    public void printOut() {
        System.out.println("isbn = " + isbn);
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }
}

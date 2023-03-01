import java.time.LocalDateTime;

public class Book {
    //attributes
    public long isbn;
    public String title;
    public String author;
    public double price;

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

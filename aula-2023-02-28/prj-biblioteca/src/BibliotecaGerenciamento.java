public class BibliotecaGerenciamento {
    public static void main(String[] args) throws InterruptedException {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.isbn = 11;
        book1.title="A Dama de Vermelho";
        book1.author="Milionario e Jose Rico";
        book1.price = 12.99;

        book2.isbn = 16;
        book2.title="Branca de Neve";
        book2.author="Maromo";
        book2.price = 19.95;

        // Registry lending
        book2.registryLending();

        Thread.sleep(5000);

        // Registry devolution
        book2.registryDevolution();

        book1.printOut();
    }
}
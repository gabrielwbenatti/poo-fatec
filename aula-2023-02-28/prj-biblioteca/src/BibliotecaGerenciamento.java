public class BibliotecaGerenciamento {
    public static void main(String[] args) throws InterruptedException {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setIsbn(11);
        book1.setTitle("A Dama de Vermelho");
        book1.setAuthor("Milionario e Jose Rico");
        book1.setPrice(12.99);

        book2.setIsbn(16);
        book2.setTitle("Branca de Neve");
        book2.setAuthor("Maromo");
        book2.setPrice(19.95);

        // Registry lending
        book2.registryLending();

        Thread.sleep(5000);

        // Registry devolution
        book2.registryDevolution();

        book1.printOut();
    }
}
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setDescricao("Agua com gas");
        produto1.imprimir();

        Produto produto2 = new Produto(2, "Colca-cola");
        produto2.imprimir();
    }
}
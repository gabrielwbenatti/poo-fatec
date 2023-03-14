public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.setMarca("HP");
        computador1.setPreco(100);
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.setMarca("ibm");
        computador2.setPreco(100);
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        if (computador2.alterarValor(200) == 1) {
            System.out.println("Valor alterado");
        } else {
            System.out.println("Valor NAO alterado");
        }

        computador2.imprimir();
    }
}

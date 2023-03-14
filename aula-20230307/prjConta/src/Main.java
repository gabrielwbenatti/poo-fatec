public class Main {
    public static void main(String[] args) {
        int idade = 10;

        Conta conta1 = new Conta();
        conta1.setNumConta(12345);
        conta1.setNomeCliente("Gabriel");
        conta1.setSaldo(100.0f);

        Conta.taxa = 0.15f;

        System.out.println(Conta.taxa);

    }
}

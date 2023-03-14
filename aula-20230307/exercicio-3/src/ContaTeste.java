import java.util.Scanner;

public class ContaTeste {
    public static Conta cc = new Conta();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ContaTeste contaTeste = new ContaTeste();

        int op = 0;

        do {
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar");
            System.out.println("9 - Sair");
            op = Integer.parseInt(contaTeste.scanner.nextLine());

            switch (op) {
                case 1:
                    contaTeste.execCadastrar();
                    break;
                case 2:
                    contaTeste.execDepositar();
                    break;
                case 3:
                    contaTeste.exeSacar();
                    break;
                case 4:
                    contaTeste.execConsultar();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (op != 9);

        System.out.println("Aplicacao encerrada");
    }

    public void execCadastrar() {
        System.out.println("Digite: ");

        System.out.println("Nro da Conta: ");
        cc.setConta(scanner.nextLine());

        System.out.println("Nome Cliente: ");
        cc.setNomeCliente(scanner.nextLine());

        System.out.println("Nro da Agencia");
        cc.setAgencia(scanner.nextLine());

        System.out.println("Saldo inicial");
        cc.setSaldo(Double.parseDouble(scanner.nextLine()));
    }

    public void execConsultar() {
        cc.imprimir();
    }

    public void exeSacar() {
        System.out.println("Digite o valor de saque: ");
        double valor = Double.parseDouble(scanner.nextLine());

        if (cc.sacar(valor) == 1) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque NAO realizado");
        }
    }

    public void execDepositar() {
        System.out.println("Digite o valor de deposito: ");
        double valor = Double.parseDouble(scanner.nextLine());

        cc.depositar(valor);
    }
}

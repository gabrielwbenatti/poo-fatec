import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Insira o primeiro numero: ");
        int n1 = Integer.parseInt(main.sc.nextLine());

        System.out.println("Insira o segundo numero: ");
        int n2 = Integer.parseInt(main.sc.nextLine());

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.alimentar();
        tabuleiro.imprimir();

        int qtdAcertos = tabuleiro.conferirQtdeNumeros(n1, n2);

        if (qtdAcertos >= 3) {
            System.out.printf("Parabens, seus numeros repetiram %d vezes \n", qtdAcertos);
            System.out.printf("Voce ganhou R$%f !!!!", (float) (qtdAcertos * 1000));
        } else  {
            System.out.println("Não foi dessa vez, tente novamente");
            System.out.printf("Seus numeros repetiram %d vezes \n", qtdAcertos);
        }

    }
}
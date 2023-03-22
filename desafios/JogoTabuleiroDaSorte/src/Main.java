import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Insira o primeiro numero: ");
        int n1 = Integer.parseInt(main.sc.nextLine());

        System.out.println("Insira o segundo numero: ");
        int n2 = Integer.parseInt(main.sc.nextLine());

        System.out.println(n1);
        System.out.println(n2);

    }
}
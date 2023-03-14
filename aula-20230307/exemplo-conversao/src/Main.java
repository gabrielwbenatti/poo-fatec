import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input1, input2;
//
//        System.out.println("Digite o primeiro valor");
//        input1 = scanner.nextLine();
//
//        System.out.println("Digite o segundo valor");
//        input2 = scanner.nextLine();
//
//        int a, b;
//
//        a = Integer.parseInt(input1);
//        b = Integer.parseInt(input2);
//
//        int c = a + b;
//        System.out.println("Resultado da soma: " + c);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo valor");
        int b = Integer.parseInt(scanner.nextLine());

        int c = a + b;
        System.out.println("Resultado da soma: " + c);
    }
}
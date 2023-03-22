import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Insira o valor do raio para calcular o volume: ");
        double raio = Double.parseDouble(main.sc.nextLine());

        Esfera esfera = new Esfera();
        double volume = esfera.getVolume(raio);

        System.out.println("O volume dessa esfera eh " + volume);
    }
}
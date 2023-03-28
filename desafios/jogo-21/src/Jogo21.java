import java.util.ArrayList;
import java.util.Scanner;

public class Jogo21 {
    private static Baralho baralho;
    private static ArrayList<Jogador> jogadores;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;

        Jogador jogador;
        baralho = new Baralho();
        jogadores = new ArrayList<Jogador>();
        baralho.inicializarBaralho();

        jogador = new Jogador();
        jogador.setNome("Computador");
        jogadores.add(jogador);

        while (op >= 1) {
            System.out.println(" --- JOGO DOS 21 PONTOS --- ");
            System.out.printf(" 1) Adicionar novo jogador [%d jogador(es)]\n", jogadores.toArray().length - 1);
            System.out.println(" 2) Iniciar jogo ");
            System.out.println(" 0) Sair ");
            op = Integer.parseInt(scan.nextLine());

            if (op == 1) {
                jogador = new Jogador();
                System.out.println(" Digite o nome do jogador: ");
                jogador.setNome(scan.nextLine());
                jogadores.add(jogador);
            }
        }
    }
}
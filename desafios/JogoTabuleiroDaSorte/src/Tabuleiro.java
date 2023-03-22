import java.util.Random;

public class Tabuleiro {
    private final int[][] tabuleiro = new int[10][10];

    public void alimentar() {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int value = r.nextInt(101);
                tabuleiro[i][j] = value;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int value = tabuleiro[i][j];
                System.out.printf("[%3d]", value);
            }
            System.out.println();
        }
    }

    public int conferirQtdeNumeros(int n1, int n2) {
        int qtdeN1 = 0;
        int qtdeN2 = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int value = tabuleiro[i][j];
                if(value==n1) qtdeN1++;
                if(value==n2) qtdeN2++;
            }
        }

        return qtdeN1 + qtdeN2;
    }
}

import java.util.ArrayList;

public class Jogador {
    private String nome;
    private int pontos;
    private ArrayList<Carta> cartas;

    public Jogador() {
        this.pontos = 0;
        this.cartas = new ArrayList<Carta>();
    }

    public void receberCarta(Carta carta) {
        this.pontos += carta.getValor();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

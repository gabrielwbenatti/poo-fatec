public class Computador {
    private String marca;
    private String cor;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private long numeroSerie;
    private double preco;

    public void imprimir() {
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }

    public void calcularValor() {
//        switch (marca) {
//            case "HP" -> preco = (preco * 1.3);
//            case "IBM" -> preco = (preco * 1.5);
//        }

        if(marca.equalsIgnoreCase("HP")) {
            preco = (preco * 1.3);
            return;
        }

        if(marca.equalsIgnoreCase("IBM")) {
            preco = (preco * 1.5);
            return;
        }
    }

    public int alterarValor(double value) {
        if (value > 0) {
            preco = value;
            return 1;
        }
        return 0;
    }
}

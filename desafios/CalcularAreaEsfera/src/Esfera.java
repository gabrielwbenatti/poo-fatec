public class Esfera {
    private double raio;
    private double volume;

    public double getVolume(double raio) {
        return (4 * Math.PI * Math.pow(raio, 3)) / 3;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

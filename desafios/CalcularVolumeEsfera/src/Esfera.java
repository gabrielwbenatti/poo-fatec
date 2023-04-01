public class Esfera {
    private double raio;

    public double getVolume(double raio) {
        return (4.0 * Math.PI *(Math.pow(raio, 3))) / 3.0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

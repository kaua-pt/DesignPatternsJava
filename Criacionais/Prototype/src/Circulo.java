public class Circulo implements Forma {
    private double raio;

    public Circulo(Circulo circulo) {
    }

    @Override
    public Forma cloneM() {
        return new Circulo(this);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}

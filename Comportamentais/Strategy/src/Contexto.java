public class Contexto {
    private Metodo met;

    public Contexto(Metodo met) {
        this.met = met;
    }

    public int calcular(int n1, int n2) {
        return met.op(n1, n2);
    }
}

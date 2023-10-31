public class ControleRemoto {
    private Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public boolean estaLigado() {
        return true;
    }

}
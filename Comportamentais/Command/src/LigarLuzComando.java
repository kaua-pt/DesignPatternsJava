public class LigarLuzComando implements Comandos {
    private LuzDaCasa casinha;

    public LigarLuzComando(LuzDaCasa casinha) {
        this.casinha = casinha;
    }

    @Override
    public void executar() {
        this.casinha.On();
    }

    @Override
    public void undo() {
        this.casinha.Off();
    }
}

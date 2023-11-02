public class CarroRoubado extends Observavel implements Carro {
    private String acao = "";

    @Override
    public void frente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frente'");
    }

    @Override
    public void vira() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vira'");
    }

    public void mudaEstado() {
        mudanca();
        notificarObservadores(acao);
    }

}

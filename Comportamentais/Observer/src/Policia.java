
public class Policia implements Carro, Observer {

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

    // perseguição
    @Override
    public void update(Observavel arg1, Object arg2) {
        String acao = String.valueOf(arg2);
        if (acao.equals("frente")) {
            System.out.println("indo para frente");
            this.frente();
        }
    }

}

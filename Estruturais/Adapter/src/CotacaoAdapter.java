public class CotacaoAdapter extends Cotacao {

    @Override
    public double getValor() {
        // TODO Auto-generated method stub
        return super.getValor() * 300;
    }

    @Override
    public void setValor(double valor) {
        // TODO Auto-generated method stub
        super.setValor(valor / 3);
    }

    public double getValorDolar() {
        return super.getValor();
    }
}

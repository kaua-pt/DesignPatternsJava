public class CalculaComum implements CalculoPreco {

    @Override
    public double valorFinal(Produto p) {
        return p.getPreco() * 0.10;
    }

}

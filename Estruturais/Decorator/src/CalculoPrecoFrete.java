public class CalculoPrecoFrete implements CalculoPreco {

    private CalculoPreco calc;

    public CalculoPrecoFrete(CalculoPreco calc) {
        this.calc = calc;
    }

    @Override
    public double valorFinal(Produto p) {
        double valorFinal = calc.valorFinal(p);
        double frete;
        if (p.getDesconto() > 0.3) {
            frete = valorFinal * 0.3;
        } else {
            frete = valorFinal * p.getDesconto();
        }
        return frete;
    }

}

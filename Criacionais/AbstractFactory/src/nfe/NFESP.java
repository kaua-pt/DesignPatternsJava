package nfe;

import venda.Produto;

public class NFESP implements NFE {

    @Override
    public double calcularImposto(Produto p) {
        double decimal = 0.18;
        return p.getValor() * decimal;
    }

}

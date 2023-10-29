package boleto;

import venda.Produto;

public interface Boleto {
    public void emitir(Produto p, double value);
}

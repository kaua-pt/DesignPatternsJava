package boleto;

import venda.Produto;

public class BoletoBRB implements Boleto {

    @Override
    public void emitir(Produto p, double value) {
        System.out.println("Emitindo nota");
    }

}

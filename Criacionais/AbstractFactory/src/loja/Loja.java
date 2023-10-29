package loja;

import boleto.Boleto;
import boleto.BoletoBRB;
import nfe.NFE;
import nfe.NFESP;
import venda.VendaFactory;

public class Loja implements VendaFactory {

    @Override
    public NFE criarNfe() {
        NFE nfe = new NFESP();
        return nfe;
    }

    @Override
    public Boleto criarBoleto() {
        Boleto boleto = new BoletoBRB();
        return boleto;
    }

}

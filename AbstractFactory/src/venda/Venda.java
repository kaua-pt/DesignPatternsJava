package venda;

import boleto.Boleto;
import nfe.NFE;

public class Venda {
    private NFE nota;
    private Boleto boleto;

    public Venda(VendaFactory vf) {
        this.nota = vf.criarNfe();
        this.boleto = vf.criarBoleto();
    }

    public void realizarVenda(Produto p) {
        double imposto = nota.calcularImposto(p);
        boleto.emitir(p, imposto);
    }
}

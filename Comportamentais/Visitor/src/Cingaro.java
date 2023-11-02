public class Cingaro extends VisitableProduct {

    public Cingaro(String name, int price) {
        super(name, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void objetosComTaxas(Visitor v) {
        v.calcularCingaro(this);
    }

}

public class Bebidas extends VisitableProduct {

    public Bebidas(String name, int price) {
        super(name, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void objetosComTaxas(Visitor v) {
        v.calcularBebidas(this);
    }

}

public class Comida extends VisitableProduct {

    public Comida(String name, int price) {
        super(name, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void objetosComTaxas(Visitor v) {
        return v.calcularComida(null);
    }

}

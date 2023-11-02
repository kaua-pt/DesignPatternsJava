public abstract class VisitableProduct {
    private String name;
    private int price;

    public VisitableProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract void objetosComTaxas(Visitor v);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

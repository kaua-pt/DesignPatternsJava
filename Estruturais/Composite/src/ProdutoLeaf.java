public class ProdutoLeaf extends ProdutoComposite {
    private String name;

    public ProdutoLeaf(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private List<Produto> produtos = new ArrayList<Produto>();
    private Mediator mediator;

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public void setMediator(Mediator m) {
        this.mediator = m;
    }

    public void sell() {
        System.out.println("vendendo");
    }
}
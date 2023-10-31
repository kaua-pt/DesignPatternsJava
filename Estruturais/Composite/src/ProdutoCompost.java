import java.util.ArrayList;
import java.util.List;

public class ProdutoCompost extends ProdutoComposite {

    // adicionar ou remover validações de um sistema
    private List<ProdutoComposite> children = new ArrayList<ProdutoComposite>();

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

}

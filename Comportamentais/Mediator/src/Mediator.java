import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Vendedor> vend = new ArrayList<Vendedor>();

    public void addSeller(Vendedor v) {
        vend.add(v);
    }

    public void buy(Vendedor v) {
        System.out.println("tao comprando de v");
    }
}

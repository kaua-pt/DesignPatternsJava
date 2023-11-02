import java.util.ArrayList;
import java.util.List;

public class AplicativoDaCasa {
    List<Comandos> comandos = new ArrayList<Comandos>();

    public void adicionarComando(Comandos c) {
        comandos.add(c);
    }

    public void executarComando(int c) {
        comandos.get(c).executar();
        
    }
}

import mensagem.Mensagem;

public class SMS implements Mensagem {

    @Override
    public void enviar(String mensagem) {
        System.out.println(mensagem);
    }

}

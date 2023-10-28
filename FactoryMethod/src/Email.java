import mensagem.Mensagem;

public class Email implements Mensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println(mensagem);
    }
}

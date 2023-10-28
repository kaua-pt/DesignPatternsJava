import mensagem.Mensagem;

public class App {
    // criar objeto sem especializa-lo em uma classe
    // utiliza interface, elimina muitas dependências
    public static void main(String[] args) throws Exception {
        String text = "VASCOO";
        Mensagem mensagem = MensagemFactory.getMensagem(0);
        mensagem.enviar(text);

    }
}

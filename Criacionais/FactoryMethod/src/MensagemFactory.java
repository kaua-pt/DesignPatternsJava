import mensagem.Mensagem;

public class MensagemFactory {
    public static Mensagem getMensagem(int i) {
        if (i == 1)
            return new SMS();
        if (i == 2)
            return new Email();
        throw new Error();
    }
}

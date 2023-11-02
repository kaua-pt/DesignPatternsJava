public class App {

    // mudar um algoritmo por outro sem notificar outras classes
    public static void main(String[] args) throws Exception {
        Contexto ctx = new Contexto(new Sum());
        Contexto ctxneg = new Contexto(new Sub());
    }
}

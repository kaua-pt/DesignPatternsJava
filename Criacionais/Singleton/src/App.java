public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();

        // mesma instância
        System.out.println(g1);
        System.out.println(g2);
    }
}

public class App {
    // adiciona novas funcionalidades em um objeto sem mecher na sua estrutura
    public static void main(String[] args) throws Exception {
        // calcula preco comum ganha as propriedades de frete
        // passa pelos 2 e faz o calculo preco comum de um e depois o de outro.
        Produto p = new Produto("gato", 2, 0.1);
        CalculoPreco cp = new CalculoPrecoFrete(new CalculaComum());
        System.out.println(cp.valorFinal(p));
    }
}

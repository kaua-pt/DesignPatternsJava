public class App {
    // causa efeito de hierarquia
    // aprovamento de orçamentos por empresa
    public static void main(String[] args) throws Exception {
        // malha de hierarquia
        Costumer c = new Costumer(10);
        
        Seller s = new Seller();
        // S.setNext().setnext() ....
        s.setNext(new CEO());
        s.handle(c);
    }
}

public class DeliveryLoc implements DeliveryFly {
    private String estadoIntriseco; // nao varia

    public DeliveryLoc(String estadoIntriseco) {
        
    }

    @Override
    public void entrega(String cliente, String entregador) { // varia
       System.out.println("entrega");
    }

}
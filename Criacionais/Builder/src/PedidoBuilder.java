public class PedidoBuilder {
    private Pedido instancia;

    public PedidoBuilder() {
        this.instancia = new Pedido();
    }

    public PedidoBuilder setPedido(String numeroPedido) {
        this.instancia.setNumeroPedido(numeroPedido);
        return this;
    }

    // vários metodos com o corpo do de cima aumentando as informacoes de instancia

    public Pedido build() {
        return instancia;
    }

}
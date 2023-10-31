public class ProxyListaCompleta implements ListaDeContato {

    private ListaCompleta listaToda;
    private String contatos;

    @Override
    public void mostrar() {
        if (listaToda == null) {
            // operação cara
            listaToda = new ListaCompleta();
        }
        // operacao barata
        listaToda.mostrar();
    }

}
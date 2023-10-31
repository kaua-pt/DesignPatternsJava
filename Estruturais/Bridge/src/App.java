public class App {
    public static void main(String[] args) throws Exception {
        Dispositivo tv = new TV();
        ControleRemoto controleParaRadio = new ControleRemotoEVolume(tv);
    }
}

public class TV implements Dispositivo {
    private String name;
    private int volume = 10;

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desligar'");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    

}

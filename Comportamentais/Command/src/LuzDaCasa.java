public class LuzDaCasa {
    private boolean isOn = false;
    private int intensity = 50;
    private String name;

    public LuzDaCasa(String name) {
        this.name = name;
    }

    public boolean On() {
        this.isOn = true;
        return true;
    }

    public boolean Off() {
        this.isOn = false;
        return false;
    }

    public int increase() {
        this.intensity += 1;
        return this.intensity;
    }

    public int decrease() {
        this.intensity -= 1;
        return this.intensity;
    }

    public String isOn() {
        return isOn ? "on" : "off";
    }

}

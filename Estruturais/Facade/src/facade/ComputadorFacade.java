package facade;

import computador.Hd;
import computador.Ram;
import computador.So;

public class ComputadorFacade {
    private Hd hd;
    private Ram ram;
    private So so;

    public ComputadorFacade() {
        this.hd = new Hd();
        this.ram = new Ram();
        this.so = new So();
    }

    public void montarPc() {
        // metodos que iremos fazer
    }

}

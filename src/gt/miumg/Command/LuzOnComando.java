
package gt.miumg.Command;

public class LuzOnComando implements Comando{

    private Luz luz;

    public LuzOnComando(Luz luz) {
        this.luz = luz;
    }

    public void execute() {
        luz.turnOn();
    }
}

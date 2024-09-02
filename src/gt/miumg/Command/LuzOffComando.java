
package gt.miumg.Command;

public class LuzOffComando implements Comando{
    private Luz luz;

    public LuzOffComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.turnOff();
    }
}

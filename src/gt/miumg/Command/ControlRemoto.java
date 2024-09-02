
package gt.miumg.Command;

public class ControlRemoto {

    private Comando comando;

    public void setCommand(Comando comando) {
        this.comando = comando;
    }

    public void pressButton() {
        comando.execute();
    }
}

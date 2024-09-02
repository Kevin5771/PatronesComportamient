package gt.miumg.Command;

public class RadioOnComando implements Comando{
    private Radio radio;

    public RadioOnComando(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.enceder();
    }
}

package gt.miumg.Command;

public class RadioOffComando implements Comando{

    private Radio radio;

    public RadioOffComando(Radio radio) {
        this.radio = radio;
    }


    @Override
    public void execute() {
        this.radio.apagar();
    }
}

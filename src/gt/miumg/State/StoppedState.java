package gt.miumg.State;
public class StoppedState implements State {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Reproduciendo música.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayer player) {
        System.out.println("No se puede pausar, la música ya está detenida.");
    }

    @Override
    public void stop(MusicPlayer player) {
        System.out.println("El reproductor ya está detenido.");
    }
}
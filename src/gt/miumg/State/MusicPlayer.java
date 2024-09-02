package gt.miumg.State;

public class MusicPlayer {
    private State state;

    public MusicPlayer() {
        state = new StoppedState(); // Estado inicial
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
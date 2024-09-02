package gt.miumg.Mediator;

public class ColleagueA extends Colleague {

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ColleagueA recibe: " + message);
    }

    public void send(String message) {
        System.out.println("ColleagueA envía: " + message);
        mediator.send(message, this);
    }
}

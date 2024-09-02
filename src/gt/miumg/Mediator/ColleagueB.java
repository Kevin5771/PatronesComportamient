package gt.miumg.Mediator;

public class ColleagueB extends Colleague {

    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ColleagueB recibe: " + message);
    }

    public void send(String message) {
        System.out.println("ColleagueB envía: " + message);
        mediator.send(message, this);
    }
}
package gt.miumg.Mediator;

public class MediadorDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("Hola desde ColleagueA");
        colleagueB.send("Hola desde ColleagueB");
    }
}

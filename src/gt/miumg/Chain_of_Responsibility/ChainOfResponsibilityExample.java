package gt.miumg.Chain_of_Responsibility;

// Clase base para los manejadores en la cadena
abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approveRequest(int amount) {
        if (canApprove(amount)) {
            processRequest(amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        } else {
            System.out.println("No one was able to approve the request for " + amount + " dollars.");
        }
    }

    protected abstract boolean canApprove(int amount);

    protected abstract void processRequest(int amount);
}

// Manejador para el Gerente
class Manager extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount < 1000;
    }

    @Override
    protected void processRequest(int amount) {
        System.out.println("Manager approved the request for " + amount + " dollars.");
    }
}

// Manejador para el Director
class Director extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount < 5000;
    }

    @Override
    protected void processRequest(int amount) {
        System.out.println("Director approved the request for " + amount + " dollars.");
    }
}

// Manejador para el CEO
class CEO extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount >= 5000;
    }

    @Override
    protected void processRequest(int amount) {
        System.out.println("CEO approved the request for " + amount + " dollars.");
    }
}

// Clase principal para probar el patrón Chain of Responsibility
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // Ejemplo de solicitudes
        manager.approveRequest(500);   // Manager should approve this
        manager.approveRequest(2000);  // Director should approve this
        manager.approveRequest(7000);  // CEO should approve this
    }
}


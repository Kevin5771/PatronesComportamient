package gt.miumg.Memento;
import java.util.ArrayList;
import java.util.List;

// Clase principal que contiene la implementación del patrón Memento
public class Main{

    // Clase que representa el estado que queremos guardar
    static class Originator {
        private String state;

        public void setState(String state) {
            this.state = state;
            System.out.println("Estado cambiado a: " + state);
        }

        // Crea un Memento para guardar el estado actual
        public Memento saveStateToMemento() {
            return new Memento(state);
        }

        // Restaurar el estado desde un Memento
        public String restoreStateFromMemento(Memento memento) {
            state = memento.getState();
            return state;
        }
    }

    // Clase que representa el Memento
    static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    // Clase que gestiona los Mementos guardados
    static class Caretaker {
        private final List<Memento> mementoList = new ArrayList<>();

        public void add(Memento state) {
            mementoList.add(state);
        }

        public Memento get(int index) {
            return mementoList.get(index);
        }
    }

    // Método principal
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Cambiando y guardando estados
        originator.setState("Estado #1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Estado #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Estado #3");
        caretaker.add(originator.saveStateToMemento());

        // Restaurar a un estado anterior
        System.out.println("Restaurando a: " + caretaker.get(1).getState());
        originator.restoreStateFromMemento(caretaker.get(1));
    }
}

package gt.miumg.Visitor;


public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Coche coche = new Coche("Toyota", "Corolla");
        Moto moto = new Moto("Honda", 650);
        Camion camion = new Camion("Volvo", 10);

        // Crear visitante
        Visitante visitante = new ImprimirInformacionVisitante();

        // Aplicar visitante a objetos
        coche.aceptar(visitante);
        moto.aceptar(visitante);
        camion.aceptar(visitante);
    }
}
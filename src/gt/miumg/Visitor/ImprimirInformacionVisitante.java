package gt.miumg.Visitor;

//informacion de los elementos
public class ImprimirInformacionVisitante implements Visitante{
    @Override
    public void visitar(Coche coche) {
        System.out.println("Coche: " + coche.getMarca() + " " + coche.getModelo());
    }

    @Override
    public void visitar(Moto moto) {
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getCilindrada() + "cc");
    }

    @Override
    public void visitar(Camion camion) {
        System.out.println("Camión: " + camion.getMarca() + " " + camion.getCapacidad() + " toneladas");
    }
}

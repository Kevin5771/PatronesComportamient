package gt.miumg.Visitor;

//Tipo de Elemento
public class Camion implements Vehiculo{
    private String marca;
    private int capacidad;

    public Camion(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }
}

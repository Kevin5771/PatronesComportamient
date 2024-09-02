package gt.miumg.Visitor;

//tipo de Elemento
public class Moto implements Vehiculo{
    private String marca;
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}

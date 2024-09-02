package gt.miumg.Visitor;

//Tipo de Elemento
public class Coche implements Vehiculo{
    private String marca;
    private String modelo;


    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}

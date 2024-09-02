package gt.miumg.Iterator;

public class ListaNombres implements Coleccion {
    private String[] nombres; // Array que almacena los nombres

    public ListaNombres(String[] nombres) {
        this.nombres = nombres; // Inicializa el array de nombres
    }

    @Override
    public Iterador crearIterador() {
        return new NombresIterador(this); // Retorna una nueva instancia de NombresIterador
    }

    public String[] getNombres() {
        return nombres; // Método para obtener los nombres (utilizado por el iterador)
    }
}

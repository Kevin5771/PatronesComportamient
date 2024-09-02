package gt.miumg.Iterator;
public class NombresIterador implements Iterador {
    private ListaNombres listaNombres;
    private int posicion = 0;

    public NombresIterador(ListaNombres listaNombres) {
        this.listaNombres = listaNombres; // Asigna la lista de nombres a iterar
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < listaNombres.getNombres().length; // Comprueba si hay más elementos
    }

    @Override
    public String siguiente() {
        if (tieneSiguiente()) {
            return listaNombres.getNombres()[posicion++]; // Retorna el siguiente nombre y avanza la posición
        }
        return null; // Retorna null si no hay más elementos
    }
}

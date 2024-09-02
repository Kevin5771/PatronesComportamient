package gt.miumg.Iterator;
public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Ana", "Carlos", "Luisa"};
        ListaNombres listaNombres = new ListaNombres(nombres); // Crea una instancia de ListaNombres

        Iterador iterador = listaNombres.crearIterador(); // Crea un iterador para la lista de nombres

        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente()); // Imprime cada nombre usando el iterador
        }
    }
}

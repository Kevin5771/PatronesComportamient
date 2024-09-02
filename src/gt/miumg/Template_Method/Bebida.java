package gt.miumg.Template_Method;

// Clase abstracta que define el esqueleto del algoritmo
abstract class Bebida {
    // Método plantilla que define el esqueleto del algoritmo
    public final void prepararReceta() {
        hervirAgua();
        preparar();
        verterEnTaza();
        if (clienteQuiereCondimentos()) { // Gancho
            agregarCondimentos();
        }
    }

    // Métodos implementados por la clase base
    private void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    private void verterEnTaza() {
        System.out.println("Vertiendo en la taza");
    }

    // Métodos abstractos a ser implementados por las subclases
    abstract void preparar();
    abstract void agregarCondimentos();

    // Método gancho, que puede ser sobrescrito por las subclases
    boolean clienteQuiereCondimentos() {
        return true;
    }
}
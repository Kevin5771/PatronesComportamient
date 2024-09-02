package gt.miumg.Template_Method;

// Subclase que implementa la preparación del café
class Cafe extends Bebida {
    @Override
    void preparar() {
        System.out.println("Filtrando el café");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche");
    }

    @Override
    boolean clienteQuiereCondimentos() {
        return false; // El cliente no quiere condimentos
    }
}


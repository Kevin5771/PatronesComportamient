package gt.miumg.Template_Method;

// Subclase que implementa la preparación del té
class Te extends Bebida {
    @Override
    void preparar() {
        System.out.println("Infusionando el té");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando limón");
    }
}

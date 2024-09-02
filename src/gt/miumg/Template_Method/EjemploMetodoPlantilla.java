package gt.miumg.Template_Method;

// Clase principal para probar el patrón
public class EjemploMetodoPlantilla {
    public static void main(String[] args) {
        Bebida te = new Te();
        te.prepararReceta();

        System.out.println();

        Bebida cafe = new Cafe();
        cafe.prepararReceta();
    }
}

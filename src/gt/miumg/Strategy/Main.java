package gt.miumg.Strategy;

public class Main {
    public static void main(String[] args) {
        double precioProducto = 100.0;

        EstrategiaDescuento descuentoPorcentaje = new DescuentoPorcentaje(20);
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioProducto);
        System.out.println("Precio con descuento por porcentaje: " + precioConDescuentoPorcentaje);

        EstrategiaDescuento descuentoMontoFijo = new DescuentoMontoFijo(15);
        double precioConDescuentoMontoFijo = descuentoMontoFijo.aplicarDescuento(precioProducto);
        System.out.println("Precio con descuento por monto fijo: " + precioConDescuentoMontoFijo);
    }

}

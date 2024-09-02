package gt.miumg.Strategy;

class DescuentoMontoFijo implements EstrategiaDescuento {
    private double montoFijo;

    public DescuentoMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}

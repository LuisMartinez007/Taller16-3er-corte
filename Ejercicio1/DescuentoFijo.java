package Taller16.Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double cantidadFija;

    // Constructor
    public DescuentoFijo(double porcentaje, double cantidadFija) {
        super(porcentaje);
        this.cantidadFija = cantidadFija;
    }

    // Método para aplicar el descuento fijo
    @Override
    public double aplicarDescuento(double precioOriginal) {
        double precioConDescuento = super.aplicarDescuento(precioOriginal);
        return precioConDescuento - cantidadFija;
    }

    // Getter para cantidad fija
    public double getCantidadFija() {
        return cantidadFija;
    }

    // Setter para cantidad fija
    public void setCantidadFija(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }
}


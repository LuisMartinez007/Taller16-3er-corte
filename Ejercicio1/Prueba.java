package Taller16.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Descuento de porcentaje
        Descuento descuentoPorcentaje = new Descuento(10); // 10% de descuento
        double precioOriginal = 100.00;
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento de porcentaje: " + precioConDescuentoPorcentaje);

        // Crear una instancia de Descuento fijo
        DescuentoFijo descuentoFijo = new DescuentoFijo(10, 5); // 10% de descuento más $5 fijo
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento fijo: " + precioConDescuentoFijo);
    }
}


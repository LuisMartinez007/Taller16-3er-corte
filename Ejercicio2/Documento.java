package Taller16.Ejercicio2;

public class Documento {
    private String contenido;
    private EstrategiaExportacion estrategiaExportacion;

    // Constructor
    public Documento(String contenido) {
        this.contenido = contenido;
    }

    // Método para establecer la estrategia de exportación
    public void setEstrategiaExportacion(EstrategiaExportacion estrategiaExportacion) {
        this.estrategiaExportacion = estrategiaExportacion;
    }

    // Método para exportar usando la estrategia establecida
    public void exportar() {
        if (estrategiaExportacion != null) {
            estrategiaExportacion.exportar(this);
        } else {
            System.out.println("No se ha establecido una estrategia de exportación.");
        }
    }

    // Método getter para contenido
    public String getContenido() {
        return contenido;
    }

    // Método setter para contenido
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

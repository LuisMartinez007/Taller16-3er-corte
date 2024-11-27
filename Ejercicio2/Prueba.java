package Taller16.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Documento
        Documento documento = new Documento("Este es el contenido del documento.");

        // Usar la estrategia de exportación a PDF
        documento.setEstrategiaExportacion(new ExportarPDF());
        documento.exportar();

        // Usar la estrategia de exportación a Word
        documento.setEstrategiaExportacion(new ExportarWord());
        documento.exportar();

        // Usar la estrategia de exportación a Excel
        documento.setEstrategiaExportacion(new ExportarExcel());
        documento.exportar();
    }
}


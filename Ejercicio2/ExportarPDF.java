package Taller16.Ejercicio2;

public class ExportarPDF implements EstrategiaExportacion {
    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a PDF: " + documento.getContenido());
    }
}

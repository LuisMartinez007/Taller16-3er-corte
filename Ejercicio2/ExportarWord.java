package Taller16.Ejercicio2;

public class ExportarWord implements EstrategiaExportacion {
    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a Word: " + documento.getContenido());
    }
}

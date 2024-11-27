package Taller16.Ejercicio2;

public class ExportarExcel implements EstrategiaExportacion {
    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a Excel: " + documento.getContenido());
    }
}


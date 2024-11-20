public class SistemaDeReportes {
    public static void main(String[] args) {
        // Usando generador de reportes PDF
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.generar("Este es el contenido del reporte PDF.");

        // Usando generador de reportes Excel
        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.generar("Este es el contenido del reporte Excel.");
    }
}
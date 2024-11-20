public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en Excel con el siguiente contenido:");
        System.out.println(contenido);
    }
}
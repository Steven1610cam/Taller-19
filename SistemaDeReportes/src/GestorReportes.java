public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generar(String contenido) {
        generadorReporte.generarReporte(contenido);
    }
}
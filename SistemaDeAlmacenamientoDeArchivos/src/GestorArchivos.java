public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombreArchivo, String contenido) {
        almacenamiento.guardarArchivo(nombreArchivo, contenido);
    }

    public String recuperar(String nombreArchivo) {
        return almacenamiento.recuperarArchivo(nombreArchivo);
    }
}
import java.util.HashMap;
import java.util.Map;


public class AlmacenamientoNube implements Almacenamiento {
    private final Map<String, String> nubeArchivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        nubeArchivos.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado en la nube: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return nubeArchivos.get(nombreArchivo);
    }
}
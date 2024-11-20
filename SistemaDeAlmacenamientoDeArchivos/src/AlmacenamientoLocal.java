import java.util.HashMap;
import java.util.Map;


public class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> sistemaArchivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        sistemaArchivos.put(nombreArchivo, contenido);
        System.out.println("Archivo guardado localmente: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return sistemaArchivos.get(nombreArchivo);
    }
}


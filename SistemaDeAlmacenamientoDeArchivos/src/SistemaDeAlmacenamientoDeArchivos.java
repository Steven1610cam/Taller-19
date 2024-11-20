public class SistemaDeAlmacenamientoDeArchivos {
    public static void main(String[] args) {
        // Usando almacenamiento local
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.guardar("documento.txt", "Contenido del documento local.");
        System.out.println("Recuperado: " + gestorLocal.recuperar("documento.txt"));

        // Usando almacenamiento en la nube
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.guardar("documento_nube.txt", "Contenido del documento en la nube.");
        System.out.println("Recuperado: " + gestorNube.recuperar("documento_nube.txt"));
    }
}
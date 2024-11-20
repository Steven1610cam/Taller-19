public class GestorAutenticacion {
    
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean iniciarSesion(String usuario, String contraseña) {
        
        return servicioAutenticacion.autenticar(usuario, contraseña);
    }
}
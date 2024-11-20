public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        
        System.out.println("Autenticando localmente al usuario: " + usuario);
        return usuario != null && contraseña != null && !usuario.isEmpty() && !contraseña.isEmpty();
    }
}
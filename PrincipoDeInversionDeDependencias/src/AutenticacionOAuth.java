public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        
        System.out.println("Autenticando mediante OAuth al usuario: " + usuario);
        return usuario != null && contraseña != null;
    }
}
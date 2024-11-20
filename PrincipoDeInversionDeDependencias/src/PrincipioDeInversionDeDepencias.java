public class PrincipioDeInversionDeDepencias {
    public static void main(String[] args) {
        
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        ServicioAutenticacion authOAuth = new AutenticacionOAuth();

        
        GestorAutenticacion gestorLocal = new GestorAutenticacion(authLocal);
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(authOAuth);

        
        System.out.println("Probando Autenticación Local:");
        
        probarAutenticacion(gestorLocal, "usuario1", "contraseña123");
        probarAutenticacion(gestorLocal, "", "");

        
        System.out.println("\nProbando Autenticación OAuth:");
        
        probarAutenticacion(gestorOAuth, "usuario2", "token456");
        probarAutenticacion(gestorOAuth, null, null);
    }

    private static void probarAutenticacion(GestorAutenticacion gestor, String usuario, String contraseña) {
        boolean resultado = gestor.iniciarSesion(usuario, contraseña);
        System.out.println("Usuario: " + usuario + ", Contraseña: " + contraseña);
        System.out.println("Resultado de autenticación: " + resultado + "\n");
    }
}
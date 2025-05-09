public class Autenticador{
    public boolean autenticar(String usuario, String contraseña){
        System.out.println("Verificación base");
        return usuario.equals("admin") && contraseña.equals("root");
    }
}

class AutenticadorBiometrico extends  Autenticador{
    @Override
    public boolean autenticar(String usuario, String contraseña){
        System.out.println("Verificación biometrica");

        /* 
        Simulacion de biometricos
        */
       return true; //or false
    }
}

class AutenticadorBanco extends Autenticador{
    @Override
    public boolean autenticar(String usuario, String contraseña){
        return usuario.equals("admin") && contraseña.equals("root");
    }

}
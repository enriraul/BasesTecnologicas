public class Notificador{
    public void enviar(String mensaje){
        System.out.println("Envía mensaje genérico: "+mensaje);
    }

    public void enviar(String mensaje, String correo){
        System.out.println("Enviando correo a "+correo +":"+mensaje);
    }
    /*
        Tipo: Whatsapp, Gmail, SMS.
    */
}
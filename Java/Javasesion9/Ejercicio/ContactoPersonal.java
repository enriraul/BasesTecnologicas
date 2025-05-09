public class ContactoPersonal extends Contacto{

    private String cumpleaños;

    public ContactoPersonal(String nombre, String apellido, String correo
    , String telefono, String cumpleaños){
        super(nombre, apellido, correo, telefono);
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String toString(){
        return super.toString() + "| Cumpleaños: "+this.cumpleaños;
    }

}
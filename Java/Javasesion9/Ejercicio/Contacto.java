public class Contacto{

    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String telefono;

    //Constructor
    public Contacto(String nombre, String apellido, String correo, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return this.nombre + " " + this.apellido + 
        " | Tel: "+this.telefono + "| correo: "+this.correo;
    }
}
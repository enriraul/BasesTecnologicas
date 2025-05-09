public class ContactoDeTrabajo extends Contacto{

    private String empresa;
    private String puesto;

    public ContactoDeTrabajo(String nombre, String apellido, String correo, 
    String telefono, String empresa, String puesto){
        super(nombre, apellido, correo, telefono);
        this.empresa = empresa;
        this.puesto = puesto;
    }

    @Override
    public String toString(){
        return super.toString() + "| Empresa: "+this.empresa+" | Puesto: "+this.puesto;
    }

}
public class Cliente{
    private String id;
    private String nombre;
    private String correo;

    public Cliente(String id, String nombre, String correo){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    //Agregar usuario PSQL

    public String InfoCliente(){
        return "Nombre: "+this.nombre+"\nCorreo"+this.correo;
    }
}
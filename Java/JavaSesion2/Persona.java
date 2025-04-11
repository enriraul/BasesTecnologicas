//package JavaSesion2;

public class Persona {
    String nombre;
    String apellido;
    int edad;

    //Constructor 
    //Objetivo principal: Inicializar. 
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void Presentar(){
        System.out.println("Hola, soy "+this.nombre);
    }

}

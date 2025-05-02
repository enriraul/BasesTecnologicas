public class Persona{
    protected String nombre;
    protected int edad;

    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método visualizar la información
    public void mostrarInformacion(){
        System.out.println("Nombre: "+ this.nombre+", edad: "+ this.edad);
    }

}


/*
    Ejercicio: 

    Clase Empleado
        nombre
        salario

        mostrarInformacion

    Clases Gerente - Empleado            palabras reservadas: 
        nombre                              extends
        salario                             super
        departamento                        @Override

        mostrarInformacion 

    Main: 
        Instancia Empleado
                  Gerente


*/
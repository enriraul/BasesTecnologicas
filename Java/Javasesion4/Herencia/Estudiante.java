//extends: Indica a Java, que está clase, es una clase hijo y 
//la clase padre es la clase Persona

public class Estudiante extends Persona{

    private String matricula;
    
    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    public void mostrarMatricula(){
        System.out.println("Matricula: "+ this.matricula);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matricula: "+ this.matricula);
    }
}
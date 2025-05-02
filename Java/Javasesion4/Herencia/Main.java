public class Main{

    public static void main(String[] args) {
        Persona persona = new Persona("Alberto",30);
        persona.mostrarInformacion();
        
        System.out.println();

        Estudiante estudiante = new Estudiante("Enrique",33,"33EnOR");
        estudiante.mostrarInformacion();
        estudiante.mostrarMatricula();
    }
}
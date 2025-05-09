import java.util.HashMap;
import java.util.Map;

class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

}

public class MapaValoresObjetos{

    public static void main(String[] args) {
        Map <Integer, Persona> personas = new HashMap<>();

        personas.put(1001, new Persona("Ana",30));
        personas.put(1002, new Persona("Luis", 45));

        //Mostrar los datos
        for (Map.Entry<Integer,Persona> entrada: personas.entrySet()) {
            System.out.println(entrada.getKey()+"->"+entrada.getValue().getNombre());
        }

    }
}
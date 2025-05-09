import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    @Override
    public boolean equals(Object o){
        if( this == o) return true;
        if(!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, edad);
    } 
}

public class MapaConObjetos{

    public static void main(String[] args) {
        Map <Persona, String> mapa = new HashMap<>();

        Persona p1 = new Persona("Pedro",35);
        Persona p2 = new Persona("Ana",28);

        mapa.put(p1, "Empleado");
        mapa.put(p2,"Gerente");

        for (Map.Entry<Persona,String> entrada: mapa.entrySet()) {
            System.out.println(entrada.getKey()+"->"+entrada.getValue());
        }

        Persona busqueda = new Persona("Ana",28);
        System.out.println(mapa.containsKey(busqueda));
    }

}
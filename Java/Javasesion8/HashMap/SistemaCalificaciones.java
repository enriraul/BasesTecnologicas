/*

    Estructura Map - HashMap

*/


//Map <K, V> Nombre_HM = new HashMAp <>();

/*
    K - Key -Clave: Unicos (Identificador)
    V - Value - Valor: TipoDeDato: int, float, doble... String, Objeto(Clase)

    Clave != Null

    HashMap: 

 */

import java.util.HashMap;
import java.util.Map;

// K - NombreAlumno   V - Calificacion
public class SistemaCalificaciones{

    public static void main(String[] args) {
        //Creación de HashMap
        Map <String, Integer> calificaciones = new HashMap<>();

        //Agregar elementos

        calificaciones.put("Ana", 85);
        calificaciones.put("Luis",75);
        calificaciones.put("Carlos",72);
        calificaciones.put("Pedro",52);
        calificaciones.put("Alberto",49);
        calificaciones.put("Luis",85);

        System.out.println("Información de los alumnos");
        // for (Map.Entry<String, Integer> entrada: calificaciones.entrySet()) {
        //     System.out.println(entrada.getKey() +":"+ entrada.getValue());
        // }

        for (Map.Entry<String, Integer> entrada: calificaciones.entrySet()) {
            if (entrada.getValue() < 60) {
                System.out.println(entrada.getKey() +":"+ entrada.getValue());
            }
        }

    }



}
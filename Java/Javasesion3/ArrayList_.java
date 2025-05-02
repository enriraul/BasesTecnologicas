
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayList_{

    public static void main(String[] args) {
        /*
            ArrayList (sintaxis):

            ArrayList <TipoDeDato> NombreVariable = new ArrayList<>();

        */

        ArrayList<String> lista = new ArrayList<>();

       /* ------------------Agregar elementos----------------------- */

        lista.add("Ana");
        lista.add("José");
        lista.add("Carlos");
        lista.add(1, "María");

        System.out.println(lista);

        /* ------------------Acceder a elementos----------------------- */
        String elemento = lista.get(1);
        System.out.println("elemento de la posicion 1 en la lista es: "+elemento);
        System.out.println(lista);


        /* ------------------Modificar elementos----------------------- */
        lista.set(3, "Luis");
        System.out.println(lista);
        lista.add("Luis");
        System.out.println(lista);


        /* ------------------Validación de listas----------------------- */
        /*Validación de existencia en listas*/
        System.out.println("La lista contiene a Carlos? "+ lista.contains("Carlos") );
        /*¿Lista vacia? */
        System.out.println("La lista contiene elementos? " +lista.isEmpty());
        System.out.println("Dimensión de la lista: "+ lista.size());
        //Devuelve el indice de la primera coincidencia con elemento de la lista.
        System.out.println("Consultar el numero de indice: "+ lista.indexOf("Luis"));
        System.out.println("Consultar el último indice del elemento: "+lista.lastIndexOf("Luis"));


        /* ------------------Sub listas----------------------- */
        System.out.println("Sublistas (1 a 3): "+ lista.subList(1, 3));
        //subList: inicio de la sublista se toma en cuenta hasta el previo elemento al ultimo.


        /* ------------------ArrayList to Arrays----------------------- */

        Object [] arregObjetos = lista.toArray();
        System.out.println(Arrays.toString(arregObjetos));

        /* ------------------Clonar listas----------------------- */

        //ArrayList <String> clon =  lista;
        ArrayList <String> clon = (ArrayList<String>) lista.clone();
        System.out.println("Lista original: " +lista);
        System.out.println("Lista clonada: "+ clon);

        /* ------------------Eliminar elementos de la lista ---------------- */
        System.out.println(lista);
        lista.remove("Luis"); //Elimina por primera ocurrencia
        System.out.println(lista);

        lista.remove(0); //Elimina el primer elemento de la lista
        System.out.println(lista);

        /*-------------Vaciar toda la lista------------ */
        lista.clear();
        System.out.println(lista);


    }
}
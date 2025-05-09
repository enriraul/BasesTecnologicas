import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap{
    public static void main(String[] args) {

        /*
            Métodos que ofrece la paqueteria de HashMap
        */
        Map <String, Integer> mapa = new HashMap<>();

        //1 put(K clave ,V valor) Agregar o actualizar una entrada
        mapa.put("Ana",40);
        mapa.put("Pedro",30);
        mapa.put("Maria",26);
        mapa.put("Luis",55);

        //2 get(K clave) Devuelve el valor asociado a la clave.
        System.out.println(mapa.get("Luis"));

        //3 contrainsKey(K clave): Verificar si existe la clave
        System.out.println(mapa.containsKey("Alberto"));

        //4 contrainsValue(V value): Verifica si existe el valor
        System.out.println(mapa.containsValue(40));

        //5 remove(k clave) Elimina un elemento. 
        mapa.remove("Luis");

        //6 size() Devuelve el tamaño del mapa
        System.out.println(mapa.size());

        //7 isEmpty() Verifica si el mapa está vacío
        System.out.println(mapa.isEmpty());

        //8 keySet() Devuelve un conjunto de las claves del mapa
        System.out.println(mapa.keySet());

        //9 values() Devuelve un conjunto de valores del mapa
        System.out.println(mapa.values());

        //10 entrySet() Conjunto de claves-valores
        System.out.println(mapa.entrySet());

        //11 putIfAbsent() Inserción de un elemento si y sólo si no existe la clave
        mapa.putIfAbsent("Pedro", 25);
        mapa.putIfAbsent("Roberto", 25);
        System.out.println(mapa.entrySet());

        // 12 replace(K clave, V valor) reemplaza el valor v, a la clave K
        mapa.replace("Roberto", 21);

        //13 limpiar
        mapa.clear();

    }
}
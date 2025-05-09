import java.util.Map;
import java.util.TreeMap;


public class TreeMapEjemplo{
    public static void main(String[] args) {

        Map <String, Integer> inventario = new TreeMap<>();

        inventario.put("elemento_1", 30);
        inventario.put("elemento_2", 30);
        inventario.put("elemento_3", 30);
        inventario.put("elemento_4", 30);
        inventario.put("elemento_5", 30);
        inventario.put("elemento_6", 30);

        for (Map.Entry<String, Integer> entrada: inventario.entrySet()) {
            if (entrada.getValue() < 60) {
                System.out.println(entrada.getKey() +":"+ entrada.getValue());
            }
        }
        
    }
}
/*

    Estructura Linked - HashMap

*/
import java.util.LinkedHashMap;
import java.util.Map;

public class RegistroCompras{
    public static void main(String[] args) {

        //Creación de LinkedHashMap
        Map<String,Double> compras = new LinkedHashMap<>();

        compras.put("item_1",125.0);
        compras.put("item_2",15.0);
        compras.put("item_3",25.0);
        compras.put("item_4",12.0);
        compras.put("item_5",5.0);
        compras.put("item_6",2.0);

        System.out.println("Compras realizadas");
        for (Map.Entry <String, Double> entrada: compras.entrySet()) {
            System.out.println(entrada.getKey()+":$"+entrada.getValue());
        }
        
    }
}


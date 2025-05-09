import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV{
    public static void main(String[] args) {
        String ruta = "contactos.csv";
        String linea;
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            while ((linea = br.readLine())!= null) { 
                String [] valores = linea.split(",");
                for (String valor : valores) {
                    System.out.println(valor + "|");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: "+ e.getMessage());
        }
    }
}
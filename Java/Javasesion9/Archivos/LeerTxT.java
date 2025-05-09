import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxT{

    public static void main(String[] args) {
        
        String ruta = "archivo.txt"; //OneDrive/Escrito/Desarrollo.../Java/Sesion9

        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;

            while ((linea = br.readLine())!= null) { 
                System.out.println(linea);
            }

        } catch (IOException e){
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }

    }
}
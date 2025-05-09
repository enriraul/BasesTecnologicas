import java.io.IOException;
import java.io.PrintWriter;

public class EscribirTxT{

    public static void main(String[] args) {
        String archivo = "./salida.txt";
        try (PrintWriter pw = new PrintWriter(archivo)){
            pw.println("Primera linea");
            pw.printf("Nombre: %s, Edad: %d \n","Enrique", 33);
            
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: "+e.getMessage());
        }
    }

}
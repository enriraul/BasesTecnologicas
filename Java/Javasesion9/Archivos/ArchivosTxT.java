import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArchivosTxT{
    public static void main(String[] args){
        try {
            List<String> lineas = Files.readAllLines(Paths.get("archivo.txt"));
            for(String linea : lineas){
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo :"+e.getMessage());
        }
    }
} 
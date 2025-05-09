import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirCSV{

    public static void main(String[] args) {
        
        String ruta = "archivo_salida.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            bw.write("Nombre, Apellido, Edad");
            bw.newLine();
            bw.write("Enrique,Olguin,33");
            bw.newLine();
            bw.write("Pedro,Perez,45");
            bw.newLine();
            
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo:"+e.getLocalizedMessage());
        }

    }

}
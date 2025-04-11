
//package Javasesion1;
import java.util.Scanner;


public class Scanner_clase {
    public static void main(String[] args) {
        //tipo_dato variable = objeto.metodos();

        Scanner scanner = new Scanner(System.in);
        
        
        // Solicitar al usuario una cadena.
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, "+nombre);

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        double estatura = scanner.nextDouble();
        
    }
}

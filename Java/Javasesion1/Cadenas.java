//package Javasesion1;

public class Cadenas {
    public static void main(String[] args) {
        
        String texto ;
        texto = "Ejemplo de cadena en Java   ";
        
        //Método básicos
        System.out.println("Texto original " + texto);
        System.out.println("Longitud"+ texto.length());
        System.out.println("Mayúsculas: "+texto.toUpperCase());
        System.out.println("Minúsculas: "+ texto.toLowerCase());
        System.out.println("Sin espacios" + texto.trim());

        //Subcadenas y busquedas.
        System.out.println("Subcadenas: "+texto.substring(5,10));
        System.out.println("¿Contiene 'Java' ?: "+texto.contains("java"));
        //Reemplazos
        System.out.println("Reemplazar 'cadena' por 'strings'"+ texto.replace("cadena","strings"));

    }
}

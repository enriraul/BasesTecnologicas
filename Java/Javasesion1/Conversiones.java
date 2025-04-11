package Javasesion1;

public class Conversiones {

    public static void main(String[] args) {
        //Conversión implícita 
        int entero = 25;
        long largo = entero; //int -> long
        float flotante = largo; 
        double doble = flotante; 
        
        System.out.println("Conversiones implícitas");
        System.out.println("entero: "+entero);
        System.out.println("long: "+largo);
        System.out.println("flotante: "+ flotante);
        System.out.println("double: "+ doble);

        //Conversiones explícitas
        double numeroDouble = 9.78;
        int numeroEntero = (int) numeroDouble;

        long numeroLargo = 1000L;
        short numeroCorto = (short) numeroLargo;
 
        System.out.println("Conversiones Explicita");
        System.out.println("double: "+numeroDouble);
        System.out.println("int (cast): "+numeroEntero);
        System.out.println("numero Largo: "+numeroLargo);
        System.out.println("numero corto (short cast): " + numeroCorto);

        //String -> int
        String numeroTexto = "42";
        int numero =  Integer.parseInt(numeroTexto);
        double dooble = Double.parseDouble(numeroTexto);

        //int <- String;
        String TextoConvertido = String.valueOf(numero);

        System.out.println("intero: "+ numero);
        System.out.println("Texto convertido: "+ TextoConvertido);

        //Conversiones Chart -> int
        char  letra = 'A'; //ASCII 65
        int codigoAscii = letra;
        int codigoAscii2 = 69;
        char letra2 = (char) codigoAscii2;


        System.out.println("Carácter: "+ letra+ "-> Código: "+ codigoAscii);
        System.out.println("Código: "+codigoAscii2+ "-> Carácter: "+letra2);
    }

}

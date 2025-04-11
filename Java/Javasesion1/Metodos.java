public class Metodos {

    /*
        accesos tipo_salida nombre_función (parametros: tipo_dato nombre_variable){}
    */ 

    //Método sin parámetros y sin retorno de información
    public static void saludar(){
        System.out.println("Hola");
    }

    //Método con parámetros y sin retorno. 
    public static void SaludarPersona(String nombre){
        System.out.println("Hola, "+nombre);
    }

    //Método con párámetros y tiene retorno.

    public static int Sumar(int a, int b){
        return a+b;
    }

    public static double obtenerPi(){
        return 3.141592;
    }

    public static void main(String[] args) {
        saludar();
        SaludarPersona("pedro");

        System.out.println("Método de suma: "+ Sumar(1,4));
        System.out.println("Solicitar el valor de PI: "+ obtenerPi());
    }
}


 /*
     * 
     * Crea un programa en Java que permita registrar 
     * las calificaciones de N estudiantes, calcular su 
     * promedio y mostrar si cada estudiante aprueba o reprueba 
     * (nota mínima para aprobar: 60). 
     * El usuario debe poder elegir cuántos estudiantes quiere ingresar.
     * 
     */

    /*
     * 
     * Métodos:
     * 
     * promedio
     * calificacion
     * ingresar
     * 
     */

     /*
      Ingresar: (N)  Solicitar al usuario N calificaciones.
      retorna los elementos cargados. 

     * Promedio: ([]) Promediar las calificaciones del grupo
     * retornar el promedio del salon. 
     * 
        Calificacion: ([]) 1, prueba | reprueba. calificacion minima: 60
      */

    /*
     * public static TDretorno nombre_funcion(int[] calificaciones){}

    * Crea un programa en Java que permita registrar 
    * las calificaciones de N estudiantes, calcular su 
    * promedio y mostrar si cada estudiante aprueba o reprueba 
    * (nota mínima para aprobar: 60). 
    * El usuario debe poder elegir cuántos estudiantes quiere ingresar.
    * 
    */

    

package Javasesion1;

public class OperadoresJava {
    
    public static void main(String[] args) {
        int a = 10, b = 5;

        //Operadores Aritmeticos
        System.out.println("Suma:"+ (a+b));
        System.out.println("Resta: "+ (a-b));
        System.out.println("Multiplicación: " + (a*b));
        System.out.println("División: "+ (a/b));
        System.out.println("Módulo: "+ (a%b));

        //Comparativos
        System.out.println("¿a es mayor que b?:  "+ (a>b));
        System.out.println("¿a es igual que b?: "+ (a == b));
        a = 10; //Asignación
        b = -1;
        //Operadores Lógicos
        boolean condicion = (a>b) || (b>0);
        System.out.println("Resultado de la operación lógica: "+ condicion);
        /*
         *  And 
         * python: and
         * java: &&
         * 
         * python: or 
         * java: ||
         * 
         * python: not
         * java: ! 
         * 
         */

        
        //Operador Terneario:
        String resultado = (a%2 == 0)? "a es par": "a es impar";
        System.out.println(resultado);
        /* 
        Comportamiento "paso a paso" del operador terneario
        String resultado1= "";
        if ( a%2==0){
            resultado1 = "a es par";
        }
        else{
            resultado1 = "a es impar";
        }
        */
    }
}

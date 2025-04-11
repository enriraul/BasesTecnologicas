package Javasesion1;

public class ControlFlujo {
    
    public static void main(String[] args) {

        /*
         * --------------------------------------------
         * 
         *              Condicionales
         * 
         * --------------------------------------------
         */


        /*
         *  if (condición){
         *      intrucciones
         * }
         * 
         */

        int edad = 18;

        if (edad>=21){
            System.out.println("Eres mayor de edad, puedes proceder a solicitar tu permiso de conducir");
        }
        else if (edad >= 18) {
            System.out.println();
        }
        else{
            System.out.println("Aún eres muy joven para realizar el trámite");
        }

        /*
         * 
         * Swtich -case
         *  
        */

        String día = "lunes";

        switch (día) {
            case "lunes": 
                System.out.println("Hoy es Lunes");     
                break;
            case "Martes":
                break;

            case "Miercoles":
                break;
            
            default:
                throw new AssertionError();
        }
        

        /*
         * --------------------------------------------
         * 
         *              Ciclos - for
         * 
         * --------------------------------------------
         */

         // i++ =  i = i+1

        for (int i=1; i<=5; i++) {
            System.out.println("interación no."+i);
        }

        /*
         * --------------------------------------------
         * 
         *              Ciclos - while
         * 
         * --------------------------------------------
         */
        int numero = 1;

        while (numero <=5) { 
            System.out.println("interación no."+numero);
            numero ++ ;
        }

        /*
         * --------------------------------------------
         * 
         *              Ciclos - do while
         * 
         * --------------------------------------------
         */
        numero = 1;
         do { 
            System.out.println("interación no."+numero);
            numero ++ ;
         } while (numero <=5);

         //break continue
        
        System.out.println("-------------------------------------------------");
        for (int i=1; i<=10; i++) {
            if(i== 3){
                continue;
            }
            if(i==5){
                System.out.println("Finaliza ciclo");
                break;
            }
            System.out.println("interación no."+i);
        }
    }
}

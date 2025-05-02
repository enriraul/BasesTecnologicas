public class Main{
    /*
        Las clases concretas, son aquellas clases que detallan el proceso de cada uno 
        de los métodos incluidos. 

        Propositos: Implementación de la funcionalidad especifica de un objeto

        Permite la herencia hacía otras clases.
    
    */

   public static void main(String[] args) {
       Coche coche = new Coche("Toyota","Corolla",2020);
       
       coche.arrancar();
       coche.detener();
   }


}
public class Main{

    public static void main(String[] args) {
        
        Coche coche = new Coche(){
            public void arrancar(){
                System.out.println("El carro está arrancando");
            }
            public void detener(){
                System.out.println("El carro se ha detenido");
            }
        };

        coche.arrancar();
        coche.detener();

        Coche coche1 = new Coche(){
            public void arrancar(){
                System.out.println("El carro está prendido");
            }
            public void detener(){
                System.out.println("El carro se ha apagado");
            }
        };

        coche1.arrancar();
        coche1.detener();

    }

}
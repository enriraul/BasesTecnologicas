public final class Coche{
    private String marca;
    private String modelo;

    public Coche (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar(){
        System.out.println("El carro está arrancando");
    }
    public void detener(){
        System.out.println("El carro se ha detenido");
    }
}

/* Clase especial, la idea principal es que la clase sea descrita dentro de un método. 
public class Ejemplo {
    void metodo() {
        class ClaseLocal {
            void saludar() { System.out.println("Hola desde clase local"); }
        }
        ClaseLocal cl = new ClaseLocal();
        cl.saludar();
    }
}

*/
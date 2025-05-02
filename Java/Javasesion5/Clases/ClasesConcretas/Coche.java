public class Coche {
    private String marca;
    private String modelo;
    private int año;


    //Constructor
    public Coche(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void arrancar(){
        System.out.println("El coche "+marca +" "+ modelo+" está arrancando");
    }
    
    public void detener(){
        System.out.println("El coche "+marca +" "+ modelo+" se ha detenido");
    }

    //métodos setter getter

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    
}
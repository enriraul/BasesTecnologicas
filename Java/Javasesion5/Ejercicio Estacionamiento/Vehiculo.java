public class Vehiculo{
    protected String marca;
    protected String modelo;
    protected int año;

    //Constructor de la clase-base
    public Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion(){
        System.out.println("Vehiculo de marca: "+ this.marca);
        System.out.println("modelo: "+ this.modelo);
        System.out.println("año: "+ this.año);
    }
}
public class Auto{
    String marca;
    String modelo;
    Motor motor;

    //Constructor
    public Auto(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void MostrarInfoAuto(){
        System.out.println("Descripción Auto: ");
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
        this.motor.mostrarInfoMotor();
    }
}

/*



*/
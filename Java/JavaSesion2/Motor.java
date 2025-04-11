public class Motor{
    String tipo; //Gasolina, Diesel, Electrico
    int cilindrada; //centimetros cubicos.

    //Constructor
    public Motor(String tipo, int cilindrada){
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    public void mostrarInfoMotor(){
        System.out.println("Descripción del motor");
        System.out.println("El motor es del tipo: "+ this.tipo);
        System.out.println("El motor cuenta con "+this.cilindrada+ " cc");
    }
}
public class Auto extends Vehiculo{

    private int numeroDePuertas;

    public Auto (String marca, String modelo, int año, int numeroDePuertas){
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("No. de Puertas: "+ this.numeroDePuertas);
    }
}
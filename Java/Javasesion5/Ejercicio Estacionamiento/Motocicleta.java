public class Motocicleta extends Vehiculo{

    private String tipoDeManillar;

    public Motocicleta(String marca, String modelo, int año, String tipoDeManillar){
        super(marca, modelo, año);
        this.tipoDeManillar = tipoDeManillar;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo de manillar: "+ this.tipoDeManillar);
    }
}
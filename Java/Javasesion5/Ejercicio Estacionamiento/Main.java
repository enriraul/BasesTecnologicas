public class Main{

    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento();

        Auto auto = new Auto("Marca_auto","Modelo_auto",2020,4);

        Motocicleta motocicleta = new Motocicleta("Marca_moto","Modelo_moto", 2020, "Tipo Manillar");

        estacionamiento.agregarVehiculo(auto);
        estacionamiento.agregarVehiculo(motocicleta);

        estacionamiento.mostrarVehiculos();

    }

}
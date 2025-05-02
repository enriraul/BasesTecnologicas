import java.util.ArrayList;

public class Estacionamiento{
    private ArrayList <Vehiculo> vehiculos;

    //Constructor
    public Estacionamiento(){
        vehiculos = new ArrayList<>(); // []
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos(){
        System.out.println("---- Información de los vehiculos dentro del estacionamiento ---");
        
        for(Vehiculo v: vehiculos){ //for (int i=0; i< vehiculos.size(); i++) vehiculos[i].mostrarInformación
            v.mostrarInformacion();
            System.out.println();
        }
    }
}
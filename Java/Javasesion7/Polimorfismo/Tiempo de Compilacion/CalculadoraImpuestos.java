//Polimorfismo en tiempo de compilación (Sobrecarga de Métodos)

public class CalculadoraImpuestos{

    public double calcular(double ingresos){
        return ingresos*0.16;
    }

    public double calcular(double ingresos, String pais){
        if(pais.equalsIgnoreCase("México")){
            return ingresos*0.16;
        }
        else if(pais.equalsIgnoreCase("USA")){
            return ingresos*0.2;
        }
        return ingresos*0.3;
    }

    public double calcular(double ingreso, String pais, boolean esExento){
        if (esExento) return 0;
        return calcular(ingreso, pais);
    }
}


public class Coche{
    private String marca;

    public Coche(String marca){
        this.marca = marca;
    }

    //Clases interna estática: No se necesita la clase externa para la instancia
    //Clases internas no estática: Son aquellas que requieren la instancia de la clase externa. 

    public class Motor{
        private int potencia;

        public Motor(int potencia){
            this.potencia = potencia;
        }

        public void MostrarDetalles(){
            System.out.println("Marca del modelo "+marca);
            System.out.println("Potencia del motor: "+potencia);
        }
    }
}
abstract  class Animal{
    
    private String nombre;
    private int edad;

    //Constructor -  Inicializar las variables
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método abstracta (sin implementación)

    public abstract  void hacerSonido();

    //Métodos concretos (sí cuentan con una implementación)
    public void dormir(){
        System.out.println(nombre + " se encuentra durmiendo");
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;  
    }
}
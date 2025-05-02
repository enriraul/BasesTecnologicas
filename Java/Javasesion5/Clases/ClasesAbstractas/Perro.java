class Perro extends Animal{

    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    public void hacerSonido(){
        System.out.println(getNombre()+  "dice guau!");
    }
}
public class Main{

    public static void main(String[] args) {
        Perro perro = new Perro("Pulgoso",6);
        Gato gato = new Gato("Michi",4);

        gato.hacerSonido();
        perro.hacerSonido();

        gato.dormir();
        perro.dormir();
    }
}
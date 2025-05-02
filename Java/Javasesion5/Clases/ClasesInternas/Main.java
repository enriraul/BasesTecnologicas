public class Main{

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota");

        //Instancia a clases internas

        Coche.Motor motor = coche.new Motor (200);
        motor.MostrarDetalles();
    }
}

/* 

Crear una clase externa llamada Libro que contenga:

Atributos: titulo y autor.

Un método mostrarInformacion() que imprima el título y autor del libro.

Dentro de Libro, crear una clase interna llamada Capitulo:

Atributos: nombre y paginas.

Un método mostrarCapitulo() que imprima el nombre del capítulo y el número de páginas.

En el método main:

Crear un objeto Libro.

Crear uno o dos objetos Capitulo asociados a ese Libro.

Mostrar la información del libro y de sus capítulos.
*/

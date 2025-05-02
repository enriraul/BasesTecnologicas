import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<LibroExistencia> catalogo;

    public Biblioteca(){
        this.catalogo = new ArrayList<>();
    }

    public void agregarLibro(LibroExistencia libro){
        this.catalogo.add(libro);
    }

    public int buscarLibro(String ISBM){
        int index_libro =-1;
        if (catalogo.isEmpty()) {
            index_libro =  -2;
        }
        else{
            
            for (int i=0; i<catalogo.size(); i++) {
                LibroExistencia libroE = catalogo.get(i);
                Libro libro_aux = libroE.getLibro();
                String ISBM_aux = libro_aux.getISBM();
                if(ISBM_aux.equals(ISBM)){
                    index_libro=i;
                    break;
                }

            }
        }
        return index_libro;  //-1 : Que no se encontró el isbm, -2: Está vacia, coc: indice
    }

    public void MostrarBusqueLibro(String ISBM){
        int indice_search = buscarLibro(ISBM);
        if (indice_search == -2){
            System.out.println("Actualmente no hay libros disponibles para eliminar");
        }
        else if (indice_search == -1){
            System.out.println("El ISBM no coincide con algún elemento del catalogo");
        }
        else{
            LibroExistencia LibroEncontrado = catalogo.get(indice_search);
            LibroEncontrado.MostrarInfo();
            
        }
    }

    public void RemoverLibro(String ISBM){
        int indice_remove = buscarLibro(ISBM);
        if (indice_remove == -2){
            System.out.println("Actualmente no hay libros disponibles para eliminar");
        }
        else if (indice_remove == -1){
            System.out.println("El ISBM no coincide con algún elemento del catalogo");
        }
        else{
            LibroExistencia LibroRemovido = catalogo.get(indice_remove);
            System.out.println("El libro ha sido eliminado");
            LibroRemovido.MostrarInfo();
            this.catalogo.remove(indice_remove);
            
        }
    }
    
}
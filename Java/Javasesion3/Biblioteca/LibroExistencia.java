public class LibroExistencia{
    private Libro libro;
    private int existencia;

    public LibroExistencia(Libro libro, int existencia){
        this.libro = libro;
        this.existencia = existencia;
    }

    public Libro getLibro (){
        return this.libro;
    }
    public int getExistencia(){
        return this.existencia;
    }

    public void setExistencia(int existencia){
        this.existencia = existencia;
    }

    public void MostrarInfo(){
        this.libro.MostrarInfo();
    }

}
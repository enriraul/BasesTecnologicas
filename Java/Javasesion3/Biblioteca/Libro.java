public class Libro{
    private String ISBM;
    private String Titulo;
    private String Autor;
    private String Editorial;

    public Libro(String ISBM, String Titulo, String Autor, String Editorial){
        this.ISBM = ISBM;
        this.Titulo  = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
    }

    //Metodos setter y getter;
    // Método set/asingar/colocar. 

    public String getISBM(){
        return this.ISBM;
    }
    public String getTitulo(){
        return this.Titulo;
    }
    public String getAutor(){
        return this.Autor;
    }
    public String getEditorial(){
        return this.Editorial;
    }
    public void MostrarInfo(){
        System.out.println("Información del libro:");
        System.out.println("ISBM: "+this.ISBM);
        System.out.println("Titulo: "+this.Titulo);
        System.out.println("Autor: "+this.Autor);
        System.out.println("Editorial: "+this.Editorial);
    }
}
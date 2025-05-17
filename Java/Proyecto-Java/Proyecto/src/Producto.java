public class Producto{
    
    private String idProducto;
    private String nombreProducto;
    private float precioProducto;
    private String categoriaProducto;
    private int existenciasProducto;

    public Producto(String idProducto,String nombreProducto, float precioProducto, String categoriaProducto, int existenciasProducto){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.categoriaProducto = categoriaProducto;
        this.existenciasProducto = existenciasProducto;
    }

/*
    public void agregarProducto(){
        //SQL-insert Productos
    }
    
    public void SetExistencias(int existencia){
        this.existenciasProducto = existencia;
        //Agregar segmento de sql
    }
*/

    public float getPrecio(){
        return this.precioProducto;
    }
    public String infoProducto(){
        return "Información del producto: \n nombre: "+this.nombreProducto+
        "\nprecio: "+this.precioProducto+"\n categoria: "+this.categoriaProducto+
        "\nexistencias: "+this.existenciasProducto;
    }
}
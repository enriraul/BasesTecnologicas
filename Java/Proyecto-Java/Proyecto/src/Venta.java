public class Venta{
    private Producto producto;
    private Cliente cliente;
    private int cantidad;

    public Venta(Producto producto, Cliente cliente, int cantidad){
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public Cliente GetCliente(){
        return this.cliente;
    }

    public Producto GetProducto(){
        return this.producto;
    }

    public int GetCantidad(){
        return this.cantidad;
    }
}
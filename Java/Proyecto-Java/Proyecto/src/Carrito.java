import java.util.ArrayList;

public class Carrito{
    private ArrayList<Venta> carrito;

    public Carrito(){
        this.carrito = new ArrayList<>();
    }

    public void AgregarCarrito(Venta venta){
        carrito.add(venta);
    }

    public void QuitarCarrito(Venta venta){
        carrito.remove(venta);
    }

    public float CuentaCarrito(){
        float cuenta = 0;
        for (Venta v : carrito) {
            System.out.println(v.GetProducto().infoProducto());
            cuenta = cuenta + v.GetCantidad()*v.GetProducto().getPrecio();
        }
        return cuenta;
    }
}
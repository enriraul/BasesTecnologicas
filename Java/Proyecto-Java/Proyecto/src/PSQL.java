import java.sql.*;

public class PSQL{
    private String url = "jdbc:postgresql://localhost:5432/dbtest";
    private String user = "enrique";
    private String password = "admin";
    private Connection conn;

    public PSQL(){
        try {
            this.conn = DriverManager.getConnection(url,user,password);
            System.out.println("Conexión con la base de datos Establecida");
        } catch (Exception e) {
            System.out.println("Error en la conexion de base de datos: "+e.getMessage());
        }
    }

    public void GetProductos(){

        try{
            String consulta = "SELECT * from producto";
            try(Statement stmt = this.conn.createStatement()) {
                ResultSet  rs  = stmt.executeQuery(consulta);
                System.out.println("id\t|nombre\t|precio\t|categoria\t|existencia\t|");
                while(rs.next()){
                    String id_producto = rs.getString("id_producto");
                    String nombre_producto = rs.getString("nombre_producto");
                    float precio_producto = rs.getFloat("precio_producto");
                    String categoria_producto = rs.getString("categoria_producto");
                    int existencia_producto = rs.getInt("existencia_producto");
                    System.out.println(id_producto+"|"+nombre_producto+"|"+precio_producto+"|"+categoria_producto+"|"+existencia_producto+"|");
                }
            } 
        }
        catch(Exception e){
            System.out.println("Error al mostrar la información de productos"+e.getMessage());
        }

    }

    public Producto getProducto(String idProducto){
        Producto producto;
        try{
            String consulta = "SELECT * from producto where id_producto = ?";
            try(PreparedStatement pstmt = conn.prepareStatement(consulta)) {

                pstmt.setString(1, idProducto);

                ResultSet  rs  = pstmt.executeQuery();
                if (rs.next()) {
                    String id_producto = rs.getString("id_producto");
                    String nombre_producto = rs.getString("nombre_producto");
                    float precio_producto = rs.getFloat("precio_producto");
                    String categoria_producto = rs.getString("categoria_producto");
                    int existencia_producto = rs.getInt("existencia_producto");

                    return producto = new Producto(id_producto,nombre_producto,precio_producto, categoria_producto, existencia_producto);
                    
                }
                else{
                    return null;
                }
            } 
        }
        catch(Exception e){
            System.out.println("Error al mostrar la información de productos"+e.getMessage());
        }
        return null;
    }

    public Cliente getCliente(String idCliente){
        Cliente cliente;
        try{
            String consulta = "SELECT * from cliente where id_cliente = ?";
            try(PreparedStatement pstmt = conn.prepareStatement(consulta)) {

                pstmt.setString(1, idCliente);

                ResultSet  rs  = pstmt.executeQuery();
                if (rs.next()) {
                    String id_cliente = rs.getString("id_cliente");
                    String nombre_cliente = rs.getString("nombre_cliente");
                    String correo_cliente = rs.getString("correo_cliente");

                    return cliente = new Cliente(id_cliente, nombre_cliente, correo_cliente);
                    
                }
                else{
                    return null;
                }
            } 
        }
        catch(Exception e){
            System.out.println("Error al mostrar la información de productos"+e.getMessage());
        }
        return null;
    }



}
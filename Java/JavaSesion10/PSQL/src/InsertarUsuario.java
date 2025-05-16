import java.sql.*;


public class InsertarUsuario{

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/dbtest";
        String user = "enrique";
        String password = "admin";

        try(Connection conn = DriverManager.getConnection(url, user, password)){
            String insert = "INSERT INTO usuario(nombre, apellido, correo) VALUES(?,?,?)";
            try (PreparedStatement pstmt =conn.prepareStatement(insert)) {
                pstmt.setString(1,"Ana");
                pstmt.setString(2,"Gómez");
                pstmt.setString(3,"ana@ejemplo.com");

                int filas = pstmt.executeUpdate();
                System.out.println("Filas insertadas: "+filas);

            } catch (Exception e) {
            }
        }catch(SQLException e){
            System.out.println("Error al conectar a la base de datos"+e.getMessage());
        }
    }
}
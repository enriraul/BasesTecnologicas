import java.sql.*;


public class ActualizarUsuario{
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/dbtest";
        String user = "enrique";
        String password = "admin";

        try (Connection conn = DriverManager.getConnection(url,user, password)) {
            String update = "UPDATE usuario set correo = ? WHERE id_usuario = ?";

            try(PreparedStatement pstmt = conn.prepareStatement(update)) {
                pstmt.setString(1,"correonuevo@ejemplo.com");
                pstmt.setInt(2, 1);

                int filas = pstmt.executeUpdate();
                System.out.println("Filas actualizadas: "+filas);
            } 
        } catch (SQLException e) {
            System.out.println("Error al actualizar: "+e.getMessage());
        }
    }
}
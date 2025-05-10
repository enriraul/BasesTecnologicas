import java.sql.*;

public class ConsultarUsuario{

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/dbtest";
        String user = "enrique";
        String password = "admin";

        try {
            Class.forName("org.postgresql.Driver"); //Obligar a cargar previamente el driver
            try(Connection conn = DriverManager.getConnection(url, user, password)){
                String consulta = "SELECT * from usuario";
                try(
                    Statement stmt = conn.createStatement(); 
                    ResultSet rs = stmt.executeQuery(consulta);
                ){
                    while (rs.next()) { 
                        int id = rs.getInt("id_usuario");
                        String nombre = rs.getString("nombre");
                        String apellido = rs.getString("apellido");
                        String correo = rs.getString("correo");
                        System.out.println("Data: id "+id+" nombre "+nombre+" apellido "+apellido+" correo "+correo);
                    }
                }
            }            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
//psql --version
}
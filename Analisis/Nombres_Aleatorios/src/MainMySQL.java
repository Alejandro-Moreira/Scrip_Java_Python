import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class MainMySQL{

    public static void main(String[] args) {
        // Configuración de la conexión a MySQL
        String jdbcUrl = "jdbc:mysql://localhost:3306/nombres_aleatoriosjava";
        String usuario = "root";
        String contraseña = "SoaD1725.";

        try {
            // Establecer la conexión a MySQL
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            // Número de nombres aleatorios a insertar
            int numNombres = 10;

            // Preparar la consulta SQL para insertar nombres
            String consultaSQL = "INSERT INTO nombres (nombre) VALUES (?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

            // Generar y insertar nombres aleatorios en MySQL
            Random random = new Random();
            for (int i = 0; i < numNombres; i++) {
                String nombre = generarNombreAleatorio();
                preparedStatement.setString(1, nombre);
                preparedStatement.executeUpdate();
            }

            System.out.println("Se insertaron " + numNombres + " nombres aleatorios en MySQL.");

            // Cerrar la conexión
            preparedStatement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Función para generar nombres aleatorios
    private static String generarNombreAleatorio() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura"};
        return nombres[new Random().nextInt(nombres.length)];
    }
}

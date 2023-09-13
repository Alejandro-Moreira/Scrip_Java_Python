import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Random;

public class MainMongoDB {

    public static void main(String[] args) {
        // Configuración de la conexión a MongoDB
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("BD_Analisis");
        MongoCollection<Document> collection = database.getCollection("NombresAleatoriosJava");

        // Número de nombres aleatorios a insertar
        int numNombres = 10;

        // Generar y insertar nombres aleatorios en MongoDB
        Random random = new Random();
        for (int i = 0; i < numNombres; i++) {
            String nombre = generarNombreAleatorio();
            String apellido = generarApellidoAleatorio();
            Document document = new Document("nombre", nombre).append("apellido", apellido);
            collection.insertOne(document);
        }

        System.out.println("Se insertaron " + numNombres + " nombres aleatorios en MongoDB.");

        // Cerrar la conexión
        mongoClient.close();
    }

    // Función para generar nombres aleatorios
    private static String generarNombreAleatorio() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura"};
        return nombres[new Random().nextInt(nombres.length)];
    }

    // Función para generar apellidos aleatorios
    private static String generarApellidoAleatorio() {
        String[] apellidos = {"Gómez", "Pérez", "Martínez", "Rodríguez", "Sánchez", "Fernández"};
        return apellidos[new Random().nextInt(apellidos.length)];
    }
}

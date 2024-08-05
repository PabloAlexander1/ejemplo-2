import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploThrows {
    public static void main(String[] args) {
        try {
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }

    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        // Utilizar try-with-resources para asegurar que el FileReader se cierre adecuadamente
        try (FileReader reader = new FileReader(nombreArchivo)) {
            // Aquí se pueden realizar operaciones con el archivo
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}

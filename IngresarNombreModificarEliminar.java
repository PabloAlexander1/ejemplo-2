import java.util.ArrayList;
import java.util.Scanner;

public class IngresarNombreModificarEliminar {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> nombres = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar nombres");
            System.out.println("2. Eliminar un nombre");
            System.out.println("3. Encontrar el nombre más largo");
            System.out.println("4. Mostrar todos los nombres");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ingresarNombres();
                    break;
                case 2:
                    eliminarNombre();
                    break;
                case 3:
                    encontrarNombreMasLargo();
                    break;
                case 4:
                    mostrarNombres();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }

    private static void ingresarNombres() {
        System.out.print("¿Cuántos nombres quieres ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }
    }

    private static void eliminarNombre() {
        System.out.print("Introduce el nombre que deseas eliminar: ");
        String nombre = scanner.nextLine();

        if (nombres.remove(nombre)) {
            System.out.println("Nombre eliminado.");
        } else {
            System.out.println("Nombre no encontrado en la lista.");
        }
    }

    private static void encontrarNombreMasLargo() {
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        String nombreMasLargo = nombres.get(0);
        for (String nombre : nombres) {
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }

        System.out.println("El nombre más largo es: " + nombreMasLargo);
    }

    private static void mostrarNombres() {
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}


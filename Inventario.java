import java.util.ArrayList;
import java.util.Scanner;

// Clase Producto que representa un producto en el inventario
class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio);
    }
}

// Clase principal que gestiona el inventario
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de Productos:");
            for (Producto p : productos) {
                p.mostrarDetalles();
            }
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Inventario");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    inventario.agregarProducto(new Producto(nombre, cantidad, precio));
                    break;
                case 2:
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    inventario.eliminarProducto(nombreEliminar);
                    break;
                case 3:
                    inventario.listarProductos();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

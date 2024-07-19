import java.util.Scanner;

public class suma{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Calcular la suma
        int suma = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        // Cerrar el scanner
        scanner.close();
    }
}
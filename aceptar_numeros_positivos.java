import java.util.Scanner;

public class aceptar_numeros_positivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1;

        while (edad <= 0) {
            System.out.print("Ingresa tu edad: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad <= 0) {
                    System.out.println("Error: La edad debe ser un número positivo.");
                }
            } else {
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.next(); // Limpiar la entrada inválida
            }
        }

        System.out.println("Edad ingresada correctamente: " + edad);
        scanner.close();
    }
}

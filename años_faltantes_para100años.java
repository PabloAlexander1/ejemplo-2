import java.time.LocalDate;
import java.util.Scanner;

public class años_faltantes_para100años {
    public static void main(String[] args) {
        // Obtener la fecha de hoy
        LocalDate fechaDeHoy = LocalDate.now();
        
        // Imprimir la fecha de hoy
        System.out.println("La fecha de hoy es: " + fechaDeHoy);
        
        // Pedir al usuario su año de nacimiento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");
        int anoDeNacimiento = scanner.nextInt();
        
        // Calcular la edad actual del usuario
        int anoActual = fechaDeHoy.getYear();
        int edadActual = anoActual - anoDeNacimiento;
        
        // Calcular los años faltantes para que el usuario tenga 100 años
        int anosParaCien = 100 - edadActual;
        
        // Imprimir los años faltantes
        if (anosParaCien > 0) {
            System.out.println("Faltan " + anosParaCien + " años para que tenga 100 años.");
        } else if (anosParaCien == 0) {
            System.out.println("¡Felicidades! Ya tiene 100 años.");
        } else {
            System.out.println("Ya ha pasado " + Math.abs(anosParaCien) + " años desde que cumplió 100 años.");
        }
        
        scanner.close();
    }
}

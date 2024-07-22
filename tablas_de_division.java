public class tablas_de_division {
    public static void main(String[] args) {
        // Imprimir las tablas de multiplicar
        System.out.println("Tablas de Multiplicar:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        // Imprimir las tablas de dividir
        System.out.println("Tablas de Dividir:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d / %d = %.2f%n", i, j, (double) i / j);
            }
            System.out.println();
        }
    }
}
    
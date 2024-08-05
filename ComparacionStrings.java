public class ComparacionStrings {
    public static void main(String[] args) {
        // Creando Strings de diferentes maneras
        String str1 = "hola";
        String str2 = "hola";
        String str3 = new String("hola");

        // Comparando con ==
        System.out.println("Usando ==:");
        System.out.println("str1 == str2: " + (str1 == str2));       // true
        System.out.println("str1 == str3: " + (str1 == str3));       // false

        // Comparando con .equals()
        System.out.println("\nUsando .equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // Demostración adicional y regla práctica
        String str4 = "Hola";
        System.out.println("\nComparando 'hola' con 'Hola':");
        System.out.println("str1 == str4: " + (str1 == str4));         // false
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true
    }
}

// Clase abstracta Figura
abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase Circulo2 que extiende Figura
public class Circulo2 extends Figura {
    private double radio;

    // Constructor que inicializa el radio del círculo
    public Circulo2(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        Circulo2 circulo = new Circulo2(5.0); // Crear un círculo con radio 5.0
        System.out.println("El área del círculo es: " + circulo.calcularArea()); // Calcular y mostrar el área
    }
}

// Clase abstracta FiguraE
abstract class FiguraE {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método abstracto para calcular el perímetro
    public abstract double calcularPerimetro();
}

// Interfaz Dibujable
interface Dibujable {
    // Método para dibujar
    void dibujar();
}

// Clase CirculoE que extiende FiguraE e implementa Dibujable
public class CirculoE extends FiguraE implements Dibujable {
    private double radio;

    // Constructor que inicializa el radio del círculo
    public CirculoE(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Implementación del método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        CirculoE circulo = new CirculoE(5.0); // Crear un círculo con radio 5.0
        System.out.println("El área del círculo es: " + circulo.calcularArea()); // Calcular y mostrar el área
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro()); // Calcular y mostrar el perímetro
        circulo.dibujar(); // Dibujar el círculo
    }
}

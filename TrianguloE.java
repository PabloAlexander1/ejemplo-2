// Definición de la clase abstracta FiguraE
abstract class FiguraE {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

// Definición de la interfaz Dibujable
interface Dibujable {
    void dibujar();
}

// Implementación de la clase TrianguloE
public class TrianguloE extends FiguraE implements Dibujable {
    private double base;
    private double altura;

    public TrianguloE(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Asumiendo que es un triángulo rectángulo
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }

    public static void main(String[] args) {
        TrianguloE triangulo = new TrianguloE(3, 4);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        triangulo.dibujar();
    }
}

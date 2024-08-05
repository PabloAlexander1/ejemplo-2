public abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
}

// Subclase para empleados a tiempo completo
class EmpleadoTiempoCompleto extends Empleado {
    private double salarioBase;

    public EmpleadoTiempoCompleto(String nombre, int id, double salarioBase) {
        super(nombre, id);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado a Tiempo Completo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + calcularSalario());
    }
}

// Subclase para empleados a medio tiempo
class EmpleadoMedioTiempo extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado a Medio Tiempo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + calcularSalario());
    }
}

// Clase principal para probar el funcionamiento
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Ana", 1, 50000);
        Empleado empleado2 = new EmpleadoMedioTiempo("Juan", 2, 20, 120);

        empleado1.mostrarDetalles();
        System.out.println("--------------------");
        empleado2.mostrarDetalles();
    }
}

import java.util.*;

class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private Set<String> autores = new HashSet<>();
    private Map<String, Integer> conteoLibrosPorAutor = new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        autores.add(libro.getAutor());
        conteoLibrosPorAutor.put(libro.getAutor(), conteoLibrosPorAutor.getOrDefault(libro.getAutor(), 0) + 1);
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("Autores únicos: " + autores);
        System.out.println("Conteo de libros por autor: " + conteoLibrosPorAutor);
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro3 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Listar todos los libros:");
        biblioteca.listarLibros();

        System.out.println("\nBuscar libros por Gabriel García Márquez:");
        List<Libro> librosDeGabriel = biblioteca.buscarPorAutor("Gabriel García Márquez");
        for (Libro libro : librosDeGabriel) {
            System.out.println(libro);
        }

        System.out.println("\nEstadísticas de la biblioteca:");
        biblioteca.mostrarEstadisticas();
    }
}

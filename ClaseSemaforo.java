public class ClaseSemaforo {

    // Definición de la enumeración EstadoSemaforo
    enum EstadoSemaforo { 
        VERDE, AMARILLO, ROJO 
    }

    public static void main(String[] args) {
        // Inicialización del estado del semáforo
        EstadoSemaforo estado = EstadoSemaforo.VERDE;

        // Uso de switch para manejar los diferentes estados del semáforo
        switch (estado) {
            case VERDE:
                System.out.println("Puedes avanzar");
                break;
            case AMARILLO:
                System.out.println("Prepárate para detenerte");
                break;
            case ROJO:
                System.out.println("Detente");
                break;
            default:
                throw new IllegalStateException("Estado desconocido: " + estado);
        }
    }
}

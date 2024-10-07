// Clase que representa el sistema de reservas de conciertos
class SistemaReservas {
    private static SistemaReservas instancia;

    // Constructor privado para evitar instanciación externa
    private SistemaReservas() {}

    // Método para obtener la única instancia del sistema
    public static SistemaReservas obtenerInstancia() {
        if (instancia == null) {
            instancia = new SistemaReservas();
        }
        return instancia;
    }

    // Método para realizar una reserva
    public void reservarEntrada(String concierto) {
        System.out.println("Entrada reservada para el concierto: " + concierto);
    }
}

// Clase cliente para usar el sistema de reservas
public class Concierto {
    public static void main(String[] args) {
        // Obtener la instancia del sistema y realizar una reserva
        SistemaReservas reservas = SistemaReservas.obtenerInstancia();
        reservas.reservarEntrada("Concierto de Rock");

        // Intentar obtener otra instancia
        SistemaReservas reservas2 = SistemaReservas.obtenerInstancia();
        System.out.println(reservas == reservas2); // Debería imprimir true
    }
}


// Clase base para las canchas
abstract class Cancha implements Cloneable {
    protected String tipo;

    public abstract void mostrarDetalles();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Implementación de la cancha de fútbol
class CanchaFutbol extends Cancha {
    public CanchaFutbol() {
        tipo = "Cancha de Fútbol";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reservando: " + tipo);
    }
}

// Implementación de la cancha de tenis
class CanchaTenis extends Cancha {
    public CanchaTenis() {
        tipo = "Cancha de Tenis";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reservando: " + tipo);
    }
}

// Clase de cliente que usa el patrón Prototype
class Cliente {
    public static void main(String[] args) {
        try {
            // Crear instancias de canchas
            Cancha canchaFutbol = new CanchaFutbol();
            Cancha canchaTenis = new CanchaTenis();

            // Clonar las canchas para nuevas reservas
            Cancha reservaFutbol = (Cancha) canchaFutbol.clone();
            Cancha reservaTenis = (Cancha) canchaTenis.clone();

            // Mostrar detalles de las reservas
            reservaFutbol.mostrarDetalles(); // "Reservando: Cancha de Fútbol"
            reservaTenis.mostrarDetalles();   // "Reservando: Cancha de Tenis"
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


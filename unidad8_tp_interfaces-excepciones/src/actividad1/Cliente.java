package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */


// Clase Cliente
// Representa a un cliente con nombre y email.
// Implementa la interfaz Notificable para recibir actualizaciones.

public class Cliente implements Notificable {

    // Atributos privados
    private String nombre;
    private String email;

    // Constructor para crear una instancia de Cliente.

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Recibe y procesa una notificación.
    // Implementa el método de la interfaz Notificable.
    // En este caso, simula el envío de un email al cliente.

    @Override
    public void notificar(String mensaje) {
        // Simulación de la lógica de notificación
        System.out.println("Notificación para " + this.nombre);
        System.out.println("Enviando email a: " + this.email);
        System.out.println("Mensaje: " + mensaje);
    }

}